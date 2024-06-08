package oodj_assignment;

import java.io.Serializable;
import java.util.List;

public class VendorReview implements Serializable{
    private String vendorId;
    private String reviews;
    private final String fileName = "Review.txt";
    
    public VendorReview (){
        
    }
    
    public VendorReview(String vendorId, String reviews){
        this.vendorId = vendorId;
        this.reviews = reviews;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String review) {
        this.reviews = review;
    }
    
    public List<Object> getReview(String vendorId){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(vendorId);        
    }
    
    public List<Object> getReview(){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList();        
    }
}
