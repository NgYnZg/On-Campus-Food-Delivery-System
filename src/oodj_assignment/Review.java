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
public class Review implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private String customerid;
    private String receiverid;
    private String review;
    private String dateTime;
    private List<Object> reviewList = new ArrayList<>();
    
    public Review(String customerid, String receiverid){
        this.customerid = customerid;
        this.receiverid = receiverid;
        initialize();
    }
    

    public String getCustomerid() {
        return customerid;
    }

    public String getReceiverid() {
        return receiverid;
    }

    public String getReview() {
        return review;
    }

    public String getDateTime() {
        return dateTime;
    }
    
    /**
     * Adding a new review into the constructed Review object and append into text file.
     * @param review 
     */
    public void add(String review){
        
        ReviewList rList = new ReviewList();
        reviewList = rList.getAll();
        this.setDateTime();
        this.setReview(review);
        reviewList.add(this);
        
//        Rewriting the text file with the new reviewList
        rList.set(reviewList);
    }
    
    /**
     * Deleting the constructed Review object from the text file.
     */
    public void delete(){
        List<Review> deletedReviewList = new ArrayList<>();
        ReviewList rList = new ReviewList();
        reviewList = rList.getAll();
        
        for(Object obj : reviewList){
            Review reviewObj = (Review) obj;
//        Setting new review and new dateTime
            if(!reviewObj.getCustomerid().equals(customerid) || !reviewObj.getReceiverid().equals(receiverid)){ 
                deletedReviewList.add(reviewObj);
            }
        }
        rList.set(deletedReviewList);
    }
    
    /**
     * Editing the constructed review object and update it into text file.
     * @param review 
     */
    public void edit(String review){
        
        List<Review> updatedReviewList = new ArrayList<>();
        ReviewList rList = new ReviewList();
        reviewList = rList.getAll();
        
        for(Object obj : reviewList){
            Review reviewObj = (Review) obj;
//        Setting new review and new dateTime
            if(reviewObj.getCustomerid().equals(customerid) && reviewObj.getReceiverid().equals(receiverid)){
                reviewObj.setReview(review);
                reviewObj.setDateTime();
            }
            updatedReviewList.add(reviewObj);
        }
        rList.set(updatedReviewList);
    }
    
    private void setDateTime() {        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("uuuu/MM/dd/HH-mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.dateTime = dtf.format(now);
    }
    
    private void setReview(String review) {
        this.review = review;
    }
    
    private void initialize(){
        try{
            for(Object obj : new ReviewList().getAll()){
                Review r = (Review) obj;
                if(r.getCustomerid().equals(customerid) && r.getReceiverid().equals(receiverid)){
                    this.dateTime = r.getDateTime();
                    this.review = r.getReview();
                }
            }
        }catch (NullPointerException ex){
            System.out.println("No Review Found");
        }
    }
    
}
