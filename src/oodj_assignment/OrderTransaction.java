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
public class OrderTransaction extends CustomerCredit{
    
    private Order order;
    private final String type = "Spend";
    
    public OrderTransaction(String username, Order order){
        super(username);
        this.order = order;
    }
    
    public void setOrder(){
        
        double amount = order.getTotalPrice();
        super.setType(type);
        super.setReloadDate();
        super.setReloadAmount(amount);
        super.setBalance(super.getBalance() - amount);
        
        CustomerCreditList list = new CustomerCreditList(super.getUsername());
        List<CustomerCredit> ccList = list.getAll();
        ccList.add(this);
        list.set(ccList);
        
        
        super.getCustomer().setCreditBalance(super.getBalance());
        
        List<UserClass> userList = new ArrayList<>();
        try{

            for (UserClass u : new UserClass().getAllUser()) {
                if (u instanceof CustomerClass) {
                    CustomerClass c = (CustomerClass) u;
                    if (c.getUsername().equals(super.getUsername()))
                        c.setCreditBalance(super.getBalance());
                    userList.add(u);// or c
                } else {
                    userList.add(u);
                }
            }  
            new UserClass().setAllUser(userList);
        }catch(NullPointerException ex){
            System.out.println("No user found");
        }
    }
    
    public String cancelOrder(){
        double amount = order.getTotalPrice();
        super.reloadCredit(amount);
        return "Rebate Successful";
    }
}
