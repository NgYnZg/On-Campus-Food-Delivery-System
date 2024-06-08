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
public class CustomerCreditList implements ObjectList{

    private final String fileName = "Transaction.txt";
    private List<CustomerCredit> creditList = new ArrayList<>();
    
    
    public CustomerCreditList(String customerid){
        OISReadFile ois = new OISReadFile(fileName);
        this.creditList = objectListToCustomerCreditList(ois.getObjectList(customerid));
    }
    
    @Override
    public List<CustomerCredit> get() {
        return creditList;
    }

    @Override
    public List<CustomerCredit> getAll() {
        OISReadFile ois = new OISReadFile(fileName);
        return objectListToCustomerCreditList(ois.getObjectList());
    }

    @Override
    public void set(List list) {
        OOSWriteFile oos = new OOSWriteFile(fileName);
        oos.writeObject(ccListToObjectList(list));
    }

    private List<CustomerCredit> objectListToCustomerCreditList(List<Object> objList){
        List<CustomerCredit> ccList = new ArrayList<>();
        try{
            for(Object obj : objList){
                if(obj instanceof CustomerCredit){
                    System.out.println("True");
                } else if (obj instanceof CustomerClass){
                    System.out.println("Customer Class");
                } else{
                    System.out.println("Others");
                }
                CustomerCredit customerCredit = (CustomerCredit) obj;
                ccList.add(customerCredit);
            }
            return ccList;
        } catch(NullPointerException ex){
            return null;
        }
    }
    
    private List<Object> ccListToObjectList(List<CustomerCredit> ccList){
        List<Object> objList = new ArrayList<>();
        try{
            for(CustomerCredit cc : ccList){
                Object obj = (Object) cc;
                objList.add(obj);
            }
            return objList;
        } catch(NullPointerException ex){
            return null;
        }
    }
    
}
