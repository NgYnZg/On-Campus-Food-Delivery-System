/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 *
 * @author YnZhong
 */
public class Cart implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private String customerid;
    private String vendorid;
    private List<Cart> cartList = new ArrayList<>();
    private Hashtable<String, Integer> food = new Hashtable<>();
    
    public Cart(Cart c){
        this.customerid = c.getCustomerid();
        this.vendorid = c.getVendorid();
        this.food = c.getFood();
    }
    
    public Cart(String customerid, String vendorid){
        this.customerid = customerid;
        this.vendorid = vendorid;
        initialize();
    }
    
    public String getCustomerid() {
        return customerid;
    }
    
    public String getVendorid() {
        return vendorid;
    }
    
    public List<Cart> getCartList() {
        return cartList;
    }

    public Hashtable<String, Integer> getFood() {
        return food;
    }
    
    public void setFood(Hashtable<String, Integer> food) {
        this.food = food;
    }

    private void initialize(){
        CartList cList = new CartList(customerid);
        try{
            for(Cart c : cList.get()){
                if(c.vendorid.equals(vendorid)){
                    this.food = c.getFood();
                }
            }
        } catch (NullPointerException ex){
        }
    }
    
    public void add(){
        renew();
    }
    
    public void add(VendorMenu f){
        this.food.put(f.getId(), food.getOrDefault(f.getId(), 0) + 1);
        renew();
    }
    
    public void deduct(String foodid){
        VendorMenu f = new VendorMenu(vendorid, foodid);
        if(food.get(f.getId()) <= 1){
            getFood().remove(f.getId());
        }
        else{
            food.put(f.getId(), food.get(f.getId())-1);
        }
        renew();
    }
    
    public void delete(){
        
        CartList cList = new CartList();
        try{
            for (Cart cart : cList.getAll()){
                    if (!(cart.getCustomerid().equals(this.customerid) && cart.getVendorid().equals(this.vendorid)))
                        cartList.add(cart);
            }
            cList.set(cartList);
        } catch(NullPointerException ex){
            System.out.println("No cart to delete");
        }
    }
    
    private void renew(){
        CartList cList = new CartList(customerid);
        cartList = cList.getAll();
        List<Cart> newCList = new ArrayList<>();
        boolean changed = false;
        try{
            for (Cart c : cartList){
                if(c.getCustomerid().equals(customerid) && c.getVendorid().equals(vendorid)){
                    c = this;
                    changed = true;
                }
                newCList.add(c);
            }
            if(changed == false)
                newCList.add(this);
        }catch (NullPointerException ex){}
        cList.set(newCList);
    }
}
