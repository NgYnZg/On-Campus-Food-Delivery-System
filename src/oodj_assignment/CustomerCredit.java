 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


/**
 *
 * @author Kristalle
 */
public class CustomerCredit implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private final String fileName = "Transaction.txt";
    private double reloadAmount, balance;
    private String customerName;
    private String username;
    private String type;
    private String transactionDate;
    private CustomerClass customer;
    

    public CustomerCredit() {
    }
    
    public CustomerCredit(String username){
        this.username = username;
        initialize();
    }

    public CustomerCredit(double reloadAmount, String username) {
        this.reloadAmount = reloadAmount;
        this.username = username;
    }

    public CustomerCredit(double reloadAmount, double balance, String customerID, String customerName, String reloadDate) {
        this.reloadAmount = reloadAmount;
        this.balance = balance;
        this.username = customerID;
        this.customerName = customerName;
        this.transactionDate = reloadDate;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String customerID) {
        this.username = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }
    
    public double getReloadAmount() {
        return reloadAmount;
    }

    public void setReloadAmount(double reloadAmount) {
        this.reloadAmount = reloadAmount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getReloadDate() {
        return transactionDate;
    }

    public void setReloadDate() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd/HH-mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.transactionDate = dtf.format(now);
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public CustomerClass getCustomer() {
        return customer;
    }
    
    public List<Object> getCreditDetail(String customerID) {
        OISReadFile orf = new OISReadFile(fileName);
        return orf.getObjectList(customerID);
    }
    
    public String reloadCredit(double reloadAmount){
        this.setType("Reload");
        this.reloadAmount = reloadAmount;
        this.balance += reloadAmount;
        
        // to add transaction date each time reload
        this.setReloadDate();
        
        CustomerCreditList list = new CustomerCreditList(username);
        List<CustomerCredit> ccList = list.getAll();
        ccList.add(this);
        list.set(ccList);
        
        customer.setCreditBalance(balance);
        
        List<UserClass> userList = new ArrayList<>();
        try{
//            for(UserClass u : customer.getAllUser()){
//                CustomerClass c = (CustomerClass) u;
//                if(c.getUsername().equals(username))
//                    c.setCreditBalance(balance);
//            userList.add(u);
//            }

            for (UserClass u : customer.getAllUser()) {
                if (u instanceof CustomerClass) {
                    CustomerClass c = (CustomerClass) u;
                    if (c.getUsername().equals(username))
                        c.setCreditBalance(balance);
                    userList.add(u);// or c
                } else {
                    userList.add(u);
                }
            }  
            customer.setAllUser(userList);
        }catch(NullPointerException ex){
            System.out.println("No user found");
            return "Reload Unsuccessful";
        }
        return "Reload Successful";
    }
    
    private void initialize(){
        OISReadFile ois = new OISReadFile("User.txt");
        customer = (CustomerClass) ois.getObjectList(username).get(0);
        this.balance = getCustomer().getCreditBalance();
        this.customerName = getCustomer().getName();
    }


}