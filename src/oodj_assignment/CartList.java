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
public class CartList implements ObjectList{
    
    private String customerid;
    private String vendorid;
    private List<Cart> cartList = new ArrayList<>();
    private final String fileName = "Cart.txt";
    
    public CartList(){}
    
    public CartList(String customerid){
        OISReadFile f = new OISReadFile(fileName);
        cartList = objectListToCartList(f.getObjectList(customerid));
    }
    
    public CartList(String customerid, String vendorid){
        OISReadFile f = new OISReadFile(fileName);
        cartList = objectListToCartList(f.getObjectList(customerid));
    }
    
    
    public String getCustomerid() {
        return customerid;
    }

    public String getVendorid() {
        return vendorid;
    }
    
    @Override
    public List<Cart> get(){
        return cartList;
    }
    
    @Override
    public List<Cart> getAll(){
        OISReadFile f = new OISReadFile(fileName);
        return objectListToCartList(f.getObjectList());
    }
    
    @Override
    public void set(List cartList){
        List<Object> objectList = cartListToObjectList(cartList);
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(objectList);
    }
    
    public List<String> getVendorList(){
        List<String> vendorList = new ArrayList<>();
        try{
            for (Cart c : cartList){
                if(!vendorList.contains(c.getVendorid() ))
                    vendorList.add(c.getVendorid());
            }
        } catch(NullPointerException ex){
            return new ArrayList<>();
        }
        return vendorList;
    }
    
    private List<Object> cartListToObjectList(List<Cart> cartList){
        List<Object> objectList = new ArrayList<>();
        try{
            for (Cart c : cartList){
                Object obj = (Object) c;
                objectList.add(obj);
            }
        } catch(NullPointerException ex){
            return new ArrayList<>();
        }
        return objectList;
    }
        
        
    private List<Cart> objectListToCartList(List<Object> objectList){
        List<Cart> cList = new ArrayList<>();
        if(objectList == null){
            return cList;
        }
        try{
            for (Object obj : objectList){
                Cart c = (Cart) obj;
                cList.add(c);
            }
        } catch(NullPointerException e){
            return new ArrayList<>();
        }
        return cList;
    }
}
