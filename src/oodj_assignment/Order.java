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
 * @author YnZhong
 */
public abstract class Order implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private String orderid;
    private String customerid;
    private String vendorid;
    private String dateTime;
    private String orderStatus;
    private String orderType;
    private double totalPrice;
    private Cart cart;
    private List<Order> orderList;
    private boolean vendorAccept;
    
    public Order(Cart c){
        cart = c;
        initialize(c);
    }
    
    public Order(String orderid){
        this.orderid = orderid;
        initialize();
    }
    
    public String getCustomerid() {
        return customerid;
    }

    public String getVendorid() {
        return vendorid;
    }
    
    public String getOrderid() {
        return orderid;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd/HH-mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.dateTime = dtf.format(now);
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public boolean isVendorAccept() {
        return vendorAccept;
    }

    public void setVendorAccept(boolean vendorAccept) {
        this.vendorAccept = vendorAccept;
    }
    
    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }
    
    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
    
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
    
    public double getTotalPrice() {
        return totalPrice;
    }
    
    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    
    public String cancel(){
    String output = "Order Not Found";
    OrderList o = new OrderList(cart.getCustomerid());
    List<Order> oList = o.getAll();
    List<Order> newList = new ArrayList<>();
    try{
        for(Order order : oList){
            if(order.getOrderid().equals(orderid) && order.getOrderStatus().equals("Pending")){
                output = "Order Cancelled Successfully";
            }
            else{
                newList.add(order);
            }
        }
        o.set(newList);
    }catch(NullPointerException ex){}
    return output;
    }
    
    
    
    private void initialize(){
        OrderList oList = new OrderList();
        try{
            for(Order o : oList.getAll()){
                if (o.getOrderid().equals(orderid)){
                    this.customerid = o.getCustomerid();
                    this.vendorid = o.getVendorid();
                    this.vendorAccept = o.isVendorAccept();
                    this.orderStatus = o.getOrderStatus();
                    this.orderType = o.getOrderType();
                    this.cart = o.getCart();
                    this.dateTime = o.getDateTime();
                    this.setTotalPrice(o.getTotalPrice());
                }
            }
        } catch(NullPointerException ex){}
    }
    
    private void initialize(Cart c){
        OrderList oList = new OrderList();
        this.setVendorAccept(false);
        this.setOrderStatus("Pending");
        this.orderid = oList.getLatestOrderid();
        this.customerid = c.getCustomerid();
        this.vendorid = c.getVendorid();
        
    }
    
    public abstract void place();

}
