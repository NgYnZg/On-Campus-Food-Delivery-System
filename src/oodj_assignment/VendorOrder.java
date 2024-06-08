package oodj_assignment;

import java.io.Serializable;
import java.util.List;

public class VendorOrder implements Serializable{
    
    private String vendorId;
    private String orderId;
    private String status;
    private String detail;
    private final String fileName = "Order.txt";

    public VendorOrder(){
        
    }
    
    public VendorOrder (String vendorId, String orderId, String detail, String status){
        this.vendorId = vendorId;
        this.orderId = orderId;
        this.detail = detail;
        this.status = status;
    }
    
    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public List<Object> getAllOrder(String vendorId){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(vendorId);        
    }
    
    public List<Object> getAllOrder(){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList();        
    }
    
    public List<Object> getOrder(String orderId){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(orderId);
    }
    
    private void writeOrderList(List<Object> orderList) {
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(orderList);
    }
        
    public void updateStatus(String orderId) {
        List<Object> orderList = getAllOrder(vendorId);
        for (Object obj : orderList) {
            VendorOrder order = (VendorOrder) obj;
            if (order.getOrderId().equals(orderId)) {
                order.setStatus("Wait for take");

            }
        }
        writeOrderList(orderList);
    }
    
        public void acceptStatus(String orderId) {
        List<Object> orderList = getAllOrder(vendorId);
        for (Object obj : orderList) {
            VendorOrder order = (VendorOrder) obj;
            if (order.getOrderId().equals(orderId)) {
                order.setStatus("Prepraring");

            }
        }
        writeOrderList(orderList);
    }
        
        public void declineStatus(String orderId) {
        List<Object> orderList = getAllOrder(vendorId);
        for (Object obj : orderList) {
            VendorOrder order = (VendorOrder) obj;
            if (order.getOrderId().equals(orderId)) {
                order.setStatus("Decline");

            }
        }
        writeOrderList(orderList);
    }
}
