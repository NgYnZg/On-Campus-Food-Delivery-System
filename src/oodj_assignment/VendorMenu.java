package oodj_assignment;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class VendorMenu extends VendorClass implements Serializable{
    
    private String id;
    private String name;
    private String describe;
    private double price;
    private String status;
    private String vendorId;
    private final String fileName = "Menu.txt";

    public VendorMenu() {
    }
    
    public VendorMenu(String vendorId, String id) {
        this.vendorId = vendorId;
        this.id = id;
        initialize();
    }
    
    public VendorMenu (String name,String describe, double price, String status){
        this.name = name;
        this.describe = describe;
        this.price = price; 
        this.status = status;
    }

    public VendorMenu (String vendorId, String id, String name, double price,String describe, String status){
        this.vendorId = vendorId;
        this.id = id;
        this.name = name;
        this.describe = describe;
        this.price = price; 
        this.status = status;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVendorId() {
        return vendorId;
    }

    public void setVendorId(String vendorId) {
        this.vendorId = vendorId;
    }
    
    public List<Object> getAll(){
        OISReadFile ois = new OISReadFile(fileName);
        return ois.getObjectList();
    }
    
    // to display all menu item
    public List<Object> getAllMenu(String vendorId){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(vendorId);        
    }
    
    public List<Object> getAllMenu(){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList();        
    }
    
    public List<Object> getMenu(String name){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(name);
    }
    
    private void writeMenuList(List<Object> menuList) {
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(menuList);
    }
    
    public void addMenu(VendorMenu menu) {
        try {
            OOSWriteFile oosWriteFile = new OOSWriteFile(fileName);
            List<Object> menuList = getAll();
            menuList.add(menu);
            oosWriteFile.writeObject(menuList);

   
        } catch (Exception e) {
            e.printStackTrace();
            // Handle the exception according to your application's requirements
        }
    }
    
    public void editMenu(VendorMenu editMenu) {
        List<Object> menuList = getAllMenu(vendorId);
        for (Object obj : menuList) {
            VendorMenu menu = (VendorMenu) obj;
            if (menu.getId().equals(editMenu.getId())) {
                menu.setName(editMenu.getName());
                menu.setDescribe(editMenu.getDescribe());
                menu.setPrice(editMenu.getPrice());

            }
        }
        writeMenuList(menuList);
    }
    
    public void deleteMenu(String id, String vendorId) {
        List<Object> menuList = getAllMenu(vendorId);
        List<Object> updatedMenuList = new ArrayList<>();
        for (Object obj : menuList) {
            VendorMenu menu = (VendorMenu) obj;
            if (!menu.getId().equals(id)) {
                updatedMenuList.add(menu);
            }
        }
        writeMenuList(updatedMenuList);
    }
    
    private void initialize(){
        OISReadFile ois = new OISReadFile(fileName);
        List<Object> menu = ois.getObjectList(vendorId);
        try{
            for(Object obj : menu){
                VendorMenu vm = (VendorMenu) obj;
                if(vm.getId().equals(id)){
                    this.describe = vm.getDescribe();
                    this.price = vm.getPrice();
                    this.status = vm.getStatus();
                    this.name = vm.getName();
                }
            }
        } catch(NullPointerException ex){
            System.out.println("No menu found");
        }
        
    }

}
