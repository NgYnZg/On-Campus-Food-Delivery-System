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
public class DeliveryTaskList implements ObjectList{

    private final String fileName = "DeliverTask.txt";
    private String keyword;
    private List<DeliveryTask> taskList = new ArrayList<>();
    
    public DeliveryTaskList(){}
    
    public DeliveryTaskList(String keyword){
        this.keyword = keyword;
    }
    
    @Override
    public List<DeliveryTask> get() {
        OISReadFile f = new OISReadFile(fileName);
        List<Object> objectList = f.getObjectList(keyword);
        try{
            for(Object obj : objectList){
                DeliveryTask o = (DeliveryTask) obj;
                taskList.add(o);
            }
            return taskList;
        } catch(NullPointerException ex){
            return null;
        }
    }

    @Override
    public List<DeliveryTask> getAll() {
        OISReadFile f = new OISReadFile(fileName);
        List<Object> objectList = f.getObjectList();
        try{
            for(Object obj : objectList){
                DeliveryTask o = (DeliveryTask) obj;
                taskList.add(o);
            }
            return taskList;
        }catch(NullPointerException ex){
            return null;
        }
    }

    @Override
    public void set(List list) {
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(taskList);
    }
}
