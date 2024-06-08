
package oodj_assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Desiree Tan
 */
public class DeliveryTask implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private String runnerid;
    private String taskStatus;
    private String orderid;
    private DeliveryOrder deliOrder;
    private final String fileName = "DeliveryTask.txt";
    
    
    public DeliveryTask(String orderid, String runnerid) {
        this.orderid = orderid;
        this.runnerid = runnerid;
        initialize();
    }
    public DeliveryTask(DeliveryOrder deliOrder) {
        this.deliOrder = deliOrder;
        this.orderid = deliOrder.getOrderid();
    }
    
    public String getRunnerid() {
        return runnerid;
    }
    
    public void setRunnerid(String runnerid) {
        this.runnerid = runnerid;
    }

    public DeliveryOrder getDeliOrder() {
        return deliOrder;
    }

    public void setDeliOrder(DeliveryOrder deliOrder) {
        this.deliOrder = deliOrder;
    }
    
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
    public String getOrderid() {
        return orderid;
    }
    
    public void accept(){
        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> taskList = new ArrayList<>();
        List<Order> orderList = new ArrayList<>();
        try{
            for(DeliveryTask dt : dtl.getAll()){
                if(dt.getOrderid().equals(this.orderid) && dt.getRunnerid().equals(runnerid)){
                    dt.setTaskStatus("Accept");
                    dt.deliOrder.setRunnerid(runnerid);
                    dt.deliOrder.setRunnerStatus("Waiting for pickup");////////
                }   
                taskList.add(dt);
            }
            dtl.set(taskList);
        }catch(NullPointerException ex){
            System.out.println("No Task Found");
        }
        OrderList ol = new OrderList();
        try{
            for(Order o : ol.getAll()){
                if(o.getOrderid().equals(orderid)){
                    deliOrder.setRunnerStatus("Waiting for pickup");
                    deliOrder.setRunnerid(runnerid);
                    o = deliOrder;
                }
                orderList.add(o);
            }
            ol.set(orderList);
        }catch (NullPointerException ex){
            System.out.println("No order found");
        }
    }
    
    public void decline(){
        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> taskList = new ArrayList<>();
        try{
            for(DeliveryTask dt : dtl.getAll()){
                if(dt.getOrderid().equals(this.orderid) && dt.getRunnerid().equals(this.runnerid)){
                    dt.setTaskStatus("Decline");
                }
                taskList.add(dt);
            }
            dtl.set(taskList);
        }catch(NullPointerException ex){
            System.out.println("No Task Found");
        }
        if(assign().equals("Unavailable")){
            CustomerNotification noti = new CustomerNotification("AD", deliOrder.getCustomerid(), deliOrder);
            noti.send();
        }
    }
    
    public void update(){
        //update RunnerStatus from waiting to pickup-> on the way->Delivery Complete
        if (deliOrder.getRunnerStatus().equals("Waiting for pickup")) {
            deliOrder.setRunnerStatus("On the way");
        } else if (deliOrder.getRunnerStatus().equals("On the way")) {
            deliOrder.setRunnerStatus("Delivery Complete");
            this.setTaskStatus("Complete");
        }

        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> taskList = dtl.getAll();
        List<DeliveryTask> newTaskList = new ArrayList<>();
        for (DeliveryTask task : taskList) {
            if (task.getOrderid().equals(this.orderid) && task.getRunnerid().equals(this.runnerid)) {
                task.setDeliOrder(deliOrder);
            }
            newTaskList.add(task);
        }
        dtl.set(newTaskList);

        OrderList ol = new OrderList();
        List<Order> orderList = ol.getAll();
        List<Order> newOrderList = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getOrderid().equals(this.orderid)) {
                DeliveryOrder delOrder = (DeliveryOrder) order;
                System.out.println("Delivery Order runner status");
                System.out.println(delOrder.getRunnerStatus());
                if (delOrder.getRunnerStatus().equals("Waiting for pickup")) {
                    delOrder.setRunnerStatus("On the way");
                } else if (delOrder.getRunnerStatus().equals("On the way")) {
                    delOrder.setRunnerStatus("Delivery Complete");
                }
                order = delOrder;
            }
            newOrderList.add(order);
        }
        ol.set(newOrderList);
        
        //Send notifications
        if (deliOrder.getRunnerStatus().equals("Delivery Complete")) {
            Notification noti = new Notification(runnerid, deliOrder.getCustomerid(), "Your order has been delivered");
            noti.send();
        }
    }
   
    
    public String assign(){
        String output = "Unavailable";
        int index, bound;
        this.taskStatus = "Pending";
        List<String> availableRunner = getRunnerList();
        if(availableRunner.isEmpty()){
            return output;
        }
        Random rand = new Random();
        bound = availableRunner.size();
        if(bound>0){
            index = rand.nextInt(bound);
            this.runnerid = availableRunner.get(index);
            System.out.println(runnerid);
            output = "Available";
            Notification noti = new Notification(runnerid, deliOrder.getCustomerid(), "Waiting for pickup");
            noti.send();
        }

        DeliveryTaskList dtl = new DeliveryTaskList();
        List<DeliveryTask> taskList = dtl.getAll();
        taskList.add(this);
        dtl.set(taskList);
        return output;
        
    }
    
    
    private List<String> getRunnerList(){
        List<String> availableRunner = new ArrayList<>();
        List<String> declinedRunner = getDeclinedRunnerid();
        try{
            for(UserClass user : new UserClass().getAllUser()){
                boolean declined = false;
                if(user.getRole().equals("Runner")){
                    RunnerClass runner = (RunnerClass) user;
                    for(String declRunner : declinedRunner){
                        if(runner.getUsername().equals(declRunner))
                            declined = true;
                    }
                    if(declined == false){
                        availableRunner.add(runner.getUsername());
                    }
                }
            }
        } catch(NullPointerException ex){}
        return availableRunner;
    }
    
    private List<String> getDeclinedRunnerid(){
        List<String> runnerList = new ArrayList<>();
        DeliveryTaskList dtl = new DeliveryTaskList();
        try{
            for(DeliveryTask task : dtl.getAll()){
                if(task.getOrderid().equals(orderid) && task.getTaskStatus().equals("Decline")){
                    runnerList.add(task.getRunnerid());
                }
            }
        } catch(NullPointerException ex){}
        return runnerList;
    }
    private void initialize(){
        DeliveryTaskList dtl = new DeliveryTaskList(orderid);
        try{
            for(DeliveryTask dt : dtl.get()){
                if(dt.getRunnerid().equals(runnerid)){
                    this.deliOrder = dt.getDeliOrder();
                    this.taskStatus = dt.getTaskStatus();
                }
            }
            
        }catch(NullPointerException ex){
            System.out.println("No task with" + orderid + "found");
        }
    }

    
}

/*

    // Method to filter and create a file containing only runners
    public void createRunnerFile() {
        OISReadFile oisReadFile = new OISReadFile(userFileName);
        List<Object> userList = oisReadFile.getObjectList();
        
        // Filter users by role "Runner"
        List<UserClass> runners = userList.stream()
                .filter(obj -> obj instanceof UserClass)
                .map(obj -> (UserClass) obj)
                .filter(user -> user.getRole().equalsIgnoreCase("Runner"))
                .collect(Collectors.toList());
        
        // Write filtered runners to a new file
        OOSWriteFile oosWriteFile = new OOSWriteFile(runnerFileName);
        oosWriteFile.writeObject(runners);
    }
*/
