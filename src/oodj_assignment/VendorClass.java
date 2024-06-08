package oodj_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class VendorClass extends UserClass
{
    
    private String vendorId;
//    private String vendorName;
//    private String businessTime;
    private String businessStatus;
    private final String fileName = "User.txt";
    
    //constructor
    public VendorClass(){
        
    }
    
    public VendorClass(String username){
        super(username);
        this.vendorId = username;
    }
    
    public VendorClass (String vendorId, String businessStatus){
        this.vendorId = vendorId;
        this.businessStatus = businessStatus;
    }
    
    public VendorClass(String username,String name, String role, String password, String email,  String phone, String dob, String businessStatus) {
        super(username, name, role, password, email, phone, dob);
        this.businessStatus = businessStatus;
        this.vendorId = username;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

//    public String getVendorName() {
//        return vendorName;
//    }
//
//    public void setVendorName(String vendorName) {
//        this.vendorName = vendorName;
//    }

//    public String getBusinessTime() {
//        return businessTime;
//    }
//
//    public void setBusinessTime(String businessTime) {
//        this.businessTime = businessTime;
//    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }
    
    //display specific vendor detail
    public List<Object> getVendorDetail (String vendorId){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(vendorId);
    }
    
    private void writeVendorDetail(List<Object> vendorDetail) {
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(vendorDetail);
    }
    
    //change specific vendor business status
    public void changeStatus (VendorClass changeStatus){
        List<Object> vendorDetail = getVendorDetail(vendorId);
        for (Object obj : vendorDetail){
            VendorClass detail = (VendorClass) obj;
            if (detail.getVendorId().equals(changeStatus.getVendorId())){
                detail.setBusinessStatus(changeStatus.getBusinessStatus());
            }
        }
        writeVendorDetail(vendorDetail);
    }


    
    


    
    
}
