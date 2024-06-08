/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kristalle
 */
public class Notification implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private String notificationid;
    private String message;
    private String dateTime;
    private UserClass sender;
    private UserClass recepient;
    
    /**
     * Search for specific notification using notification id, used for deleting read messages
     * @param notificationid Notification id of the message
     */
    public Notification(String notificationid) {
        this.notificationid = notificationid;
    }
    
    public Notification(String senderid, String recipientid) {
        initialize(senderid, recipientid);
    }
    
    /**
     * Construct notification object with sender & recipient object with message
     * @param senderid Username of sender
     * @param recipientid Username of recipient
     * @param message Message to be read
     */
    public Notification(String senderid, String recipientid, String message) {
        this.message = message;
        initialize(senderid, recipientid);
    }
    
    public String getMessage() {
        return message;
    }
    
    public void setMessage(String message) {
        this.message = message;
    }
    
    public String getDateTime() {
        return dateTime;
    }
    
    public void setDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd/HH-mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.dateTime = dtf.format(now);
    }
    
    public UserClass getSender() {
        return sender;
    }
    
    public UserClass getRecepient() {
        return recepient;
    }
    
    public String getNotificationid() {
        return notificationid;
    }
    
    public void setNotificationid(String notificationid) {
        this.notificationid = notificationid;
    }
    
    private void initialize(String senderid, String recipientid){
        try{
            boolean assigned = false;
            for (UserClass user : new UserClass().getAllUser()){
                if(user.getUsername().equals(senderid)){
                    this.sender = user;
                    assigned = true;
                }else if (user.getUsername().equals(recipientid))
                    this.recepient = user;
            }
            if(!assigned){
                sender = new AdminClass();
                sender.setName("System");
            }
        }catch(NullPointerException ex){
            System.out.println("No User Found");
        }
    }
    
    public void send() {
//        NotificationList notiList = new NotificationList();
//        this.setDateTime();
//        this.setNotificationid(notiList.getLatestNotificationid());
//        List<Notification> allNotiList = notiList.getAll();
//        allNotiList.add(this);
//        notiList.set(allNotiList);
//        System.out.println(getNotificationid());

        NotificationList notiList = new NotificationList();
        this.setDateTime();
        this.setNotificationid(notiList.getLatestNotificationid());
        List<Notification> allNotiList = notiList.getAll();

        allNotiList.add(this);
        notiList.set(allNotiList);
    }
    
    public void delete() {
        NotificationList notiList = new NotificationList();
        List<Notification> allNotiList = new ArrayList<>();
        try{
            for(Notification noti : notiList.getAll()){
                if(!noti.getNotificationid().equals(this.getNotificationid()))
                    allNotiList.add(noti);
                else{
                    System.out.println(noti.getNotificationid());
                }
            }
            notiList.set(allNotiList);
        }catch(NullPointerException ex){
            System.out.println("No notification list found");
        }
    }
    
    @Override
    public String toString(){
        String output = String.format("Sender Name: %s \nMessage: %s",
                sender.getName(), message);
        return output;
    }
}
