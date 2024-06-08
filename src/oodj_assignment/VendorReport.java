package oodj_assignment;

import java.io.Serializable;
import java.util.List;

public class VendorReport implements Serializable{
    
    private String reportType;
    private String vendorId;
    private final String fileName1 = "OrderHistory.txt";
    private final String fileName2 = "Revenue.txt";

    public VendorReport(){
        
    }
    
    public VendorReport(String reportType, String vendorId){
        this.reportType = reportType;
        this.vendorId = vendorId;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    
    public String getReportType() {
        return reportType;
    }

    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
    
    public List<Object> getOrderHistory(String vendorId){
        OISReadFile r = new OISReadFile(fileName1);
        return r.getObjectList(vendorId);        
    }
    
    public List<Object> getOrderHistory(){
        OISReadFile r = new OISReadFile(fileName1);
        return r.getObjectList();        
    }
    
    public List<Object> getRenevue(String vendorId){
        OISReadFile r = new OISReadFile(fileName2);
        return r.getObjectList(vendorId);        
    }
    
    public List<Object> getRenevue(){
        OISReadFile r = new OISReadFile(fileName2);
        return r.getObjectList();        
    }
}
