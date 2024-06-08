/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author YnZhong
 */
public class DeliveryOrder extends Order{
    
    private final String orderType = "Delivery";
    private String location;
    private String runnerid;
    private String runnerStatus;
    private int deliveryFee;
    
    public DeliveryOrder(Cart c, String location){
        super(c);
        this.location = location;
    }
    
    public DeliveryOrder(String orderid){
        super(orderid);
        initialize();
    }
    
    public DeliveryOrder(String orderid, String runnerid){
        super(orderid);
        this.runnerid = runnerid;
    }
    
    public String getRunnerid() {
        return runnerid;
    }

    public String getRunnerStatus() {
        return runnerStatus;
    }

    public void setRunnerStatus(String runnerStatus) {
        this.runnerStatus = runnerStatus;
    }
    
    public int getDeliveryFee() {
        return deliveryFee;
    }

    public void setRunnerid(String runnerid) {
        this.runnerid = runnerid;
    }
    
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    @Override
    public void place() {
        
//        Setting default value
        this.runnerStatus = "Pending";
        this.deliveryFee = (int) (super.getTotalPrice() * 0.05);
        if(deliveryFee<3){
            deliveryFee = 3;
        }
        super.setTotalPrice(super.getTotalPrice() + deliveryFee);
        super.setOrderType(orderType);
        super.setDateTime();
        
        OrderList o = new OrderList();
        List<Order> oList = new ArrayList<>();
        if(o.getAll() != null)
            oList = o.getAll();
        oList.add(this);
        o.set(oList);
    }
    
    private void initialize(){
        OrderList oList = new OrderList();
        try{
            for(Order o : oList.getAll()){
                if (o.getOrderid().equals(super.getOrderid())){
                    DeliveryOrder delorder = (DeliveryOrder) o;
                    this.runnerStatus = delorder.getRunnerStatus();
                    this.setRunnerid(delorder.getRunnerid());
                    this.deliveryFee = delorder.getDeliveryFee();
                    this.location = delorder.getLocation();
                }
            }
        } catch(NullPointerException ex){
            System.out.println("No order found");
        }
    }
}
