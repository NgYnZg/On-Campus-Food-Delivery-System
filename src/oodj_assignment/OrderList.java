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
public class OrderList implements ObjectList{
    
    private final String fileName = "Order.txt";
    private String userid;
    private List<Order> orderList = new ArrayList<>();
    
    public OrderList(){}
    
    public OrderList(String userid){
        this.userid = userid;
    }
    
    @Override
    public List<Order> get(){
        orderList = new ArrayList<>();
        OISReadFile f = new OISReadFile(fileName);
        List<Object> objectList = f.getObjectList(userid);
        try{
            for(Object obj : objectList){
                Order o = (Order) obj;
                orderList.add(o);
            }
            return orderList;
        } catch(NullPointerException ex){
            return null;
        }
    }
    
    
    @Override
    public List<Order> getAll(){
        orderList = new ArrayList<>();
        OISReadFile f = new OISReadFile(fileName);
        List<Object> objectList = f.getObjectList();
        try{
            for(Object obj : objectList){
                Order o = (Order) obj;
                orderList.add(o);
            }
            return orderList;
        }catch(NullPointerException ex){
            return null;
        }
    }
    
    @Override
    public void set(List oList){
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(oList);
    }
    
    public String getLatestOrderid(){
        List<Order> allOrderList = getAll();
        try{
            if(allOrderList.size() <=0)
                return "O0";
            Order o = allOrderList.get(allOrderList.size()-1);
            int orderid = Integer.parseInt(o.getOrderid().substring(1));
            String newid = "O" + (orderid+1);
            return newid;
        }catch(NullPointerException ex){
            return "O0";
        }
    }
}
