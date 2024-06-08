/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.util.List;

/**
 *
 * @author YnZhong
 */
public class CustomerNotification extends Notification{

    private CustomerClass customer;
    private DeliveryOrder order;
    private VendorClass vendor;
    
    public CustomerNotification(String senderid, String recepientid, DeliveryOrder order) {
        super(senderid, recepientid);
        customer = (CustomerClass) super.getRecepient();
        this.order = order;
        initialize();
    }

    public DeliveryOrder getOrder() {
        return order;
    }
    
    @Override
    public void send() {
        NotificationList notiList = new NotificationList();
        this.setDateTime();
        this.setNotificationid(notiList.getLatestNotificationid());
        List<Notification> allNotiList = notiList.getAll();
        allNotiList.add(this);
        notiList.set(allNotiList);
    }

    @Override
    public void delete() {
        NotificationList notiList = new NotificationList();
        List<Notification> allNotiList = notiList.getAll();
        try{
            for(Notification noti : notiList.getAll()){
                if(!noti.getNotificationid().equals(this.getNotificationid()))
                    System.out.println("System noti id: " + noti.getNotificationid());
                    allNotiList.add(noti);
            }
            System.out.println("Object noti id: " + this.getNotificationid());
            notiList.set(allNotiList);
        }catch(NullPointerException ex){
            System.out.println("No notification list found");
        }
    }
    
    
    @Override
    public String toString(){
        String output = String.format("Customer Name: %s \nFood: %s \nType: %s \nTotal Price: %s",
                customer.getName(), getOrder().getCart(), getOrder().getOrderType(), getOrder().getTotalPrice());
        return output;
    }
    
    private void initialize(){
        try{
            for(UserClass user : new UserClass().getAllUser()){
                if(user.getUsername().equals(getOrder().getCart().getVendorid())){
                    this.vendor = (VendorClass) user;
                }
            }
        } catch(NullPointerException ex){
            System.out.println("No User Found");
        }
    }

    
    
}
