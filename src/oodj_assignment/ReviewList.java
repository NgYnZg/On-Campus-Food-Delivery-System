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
public class ReviewList implements ObjectList{
    
    private final String fileName = "Review.txt";
    private String userid;
    private String customerid;
    private String vendorid;
    private List<Object> reviewList = new ArrayList<>();
    
    public ReviewList(){
    }
    public ReviewList(String userid){
        this.userid = userid;
    }
    public ReviewList(String customerid, String vendorid){
        this.customerid = customerid;
        this.vendorid = vendorid;
    }


    public String getUserid() {
        return userid;
    }
    public String getCustomerid() {
        return customerid;
    }
    public String getVendorid() {
        return vendorid;
    }

    @Override
    public List getAll() {
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList();
    }
    
    @Override
    public List get() {
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(userid);
    }
    
//    Take the whole array of review object and convert them into array of object and write them into the file
    @Override
    public void set(List reviewList){
        List<Object> objList = convertList(reviewList);
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(reviewList);
    }
    
    private List convertList(List<Review> reviewList){
        List<Object> objectList = new ArrayList<>();
        for(Review r : reviewList){
            Object obj = (Object) r;
            objectList.add(obj);
        }
        return objectList;
    }
    
}