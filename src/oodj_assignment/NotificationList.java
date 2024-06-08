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
public class NotificationList implements ObjectList{

    private final String fileName = "Notification.txt";
    private String userid;
    private List<Notification> notiList = new ArrayList<>();
    
    public NotificationList(){}
    
    public NotificationList(String userid){
        this.userid = userid;
    }
    
    @Override
    public List<Notification> get() {
        notiList = new ArrayList<>();
        OISReadFile f = new OISReadFile(fileName);
        List<Object> objectList = f.getObjectList();
        try{
            for(Object obj : objectList){
                Notification o = (Notification) obj;
                if(o.getRecepient().getUsername().equals(userid))
                    notiList.add(o);
            }
            return notiList;
        } catch(NullPointerException ex){
            return null;
        }
    }

    @Override
    public List<Notification> getAll() {
        notiList = new ArrayList<>();
        OISReadFile f = new OISReadFile(fileName);
        List<Object> objectList = f.getObjectList();
        try{
            for(Object obj : objectList){
                Notification o = (Notification) obj;
                notiList.add(o);
            }
            return notiList;
        }catch(NullPointerException ex){
            return null;
        }
    }

    @Override
    public void set(List list) {
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(list);
    }
    
    public String getLatestNotificationid(){
        List<Notification> allNotiList = getAll();
        try {
            if (!allNotiList.isEmpty()) {
                Notification o = allNotiList.get(allNotiList.size() - 1);
                int notificationid = Integer.parseInt(o.getNotificationid().substring(1));
                String newid = "N" + (notificationid + 1);
                return newid;
            } else {
                return "N0";
            }
        } catch (NullPointerException ex) {
            return "N0";
        }
    }
}
