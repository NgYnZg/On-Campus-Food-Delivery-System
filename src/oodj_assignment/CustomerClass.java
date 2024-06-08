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
public class CustomerClass extends UserClass{
    
    private double creditBalance = 0.0;
    
    public CustomerClass(){
    }
    
    public CustomerClass(String username){
        super(username);
        initialize();
    }
    
    public CustomerClass(String username, double creditBalance){
        super(username);
        initialize();
        this.creditBalance +=creditBalance;
    }
    public CustomerClass(String username,String name, String role, String password, String email,  String phone, String dob) {
        super(username, name, role, password, email, phone, dob);
    }
    
    public double getCreditBalance() {
        return creditBalance;
    }

    public void setCreditBalance(double creditBalance) {
        this.creditBalance = creditBalance;
    }
    
    private void initialize(){
        OISReadFile ois = new OISReadFile("User.txt");
        try{
            List<Object> list = ois.getObjectList(super.getUsername());
            CustomerClass customer = (CustomerClass) list.get(0);
            
            this.setCreditBalance(customer.getCreditBalance());
            super.setRole(customer.getRole());
            super.setDob(customer.getDob());
            super.setEmail(customer.getEmail());
            super.setPhone(customer.getPhone());
            super.setName(customer.getName());
        } catch(IndexOutOfBoundsException | NullPointerException ex){
            System.out.println("No user found");
        }
    }
}
