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
public class DineInOrder extends Order{

    private final String orderType = "DineIn";
    
    public DineInOrder(Cart c){
        super(c);
    }
    
    public DineInOrder(String orderid){
        super(orderid);
    }
    
    @Override
    public void place() {
        this.setOrderType(orderType);
        this.setDateTime();
        
        OrderList o = new OrderList();
        List<Order> oList = new ArrayList<>();
        
        if(o.getAll() != null)
            oList = o.getAll();
        
        oList.add(this);
 
        o.set(oList);
    }
    
}
