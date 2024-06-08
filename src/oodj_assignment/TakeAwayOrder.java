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
public class TakeAwayOrder extends Order{

    private final String orderType = "TakeAway";
    
    public TakeAwayOrder(Cart c){
        super(c);
    }
    
    public TakeAwayOrder(String orderid){
        super(orderid);
    }
    
    @Override
    public void place() {
        OrderList o = new OrderList();
        
        this.setOrderType(orderType);
        this.setDateTime();
        List<Order> oList = new ArrayList<>();
        if(o.getAll() != null)
            oList = o.getAll();
        
        oList.add(this);
        o.set(oList);
    }
    
}
