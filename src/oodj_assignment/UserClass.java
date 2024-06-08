/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class UserClass implements Serializable{
    private String username,password,email,role,name,phone,dob;
    private static final long serialVersionUID = 300868350964877598L;
    //Serialization Versioning - to make sure the serialization & deserialization compatible
    private final String fileName = "User.txt";
    
    public UserClass(){
        
    }

    public UserClass(String username) {
        this.username = username;
        initialize();
    }
    
    public UserClass(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public UserClass(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
    }

    public UserClass(String username, String password, String email, String role) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
    }    

    public UserClass(String username,String name, String role, String password, String email,  String phone, String dob) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.role = role;
        this.name = name;
        this.phone = phone;
        this.dob = dob;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getRole(){
        return role;
    }
    
    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    

    
    public static String getRole(String username) {
        String rolePrefix = username.substring(0, 2);

        switch (rolePrefix) {
            case "AD":
                return "Admin";
            case "CT":
                return "Customer";
            case "VD":
                return "Vendor";
            case "RN":
                return "Runner";
            default:
                return "Unknown";
        }
    }
     public String getFileName() {
        return fileName;
    }
    
    /**
     * A get method to get all user object inside "User.txt" file, the list are to be updated and 
     * rewritten into the "User.txt" file
     * @return A List with UserClass objects, return null instead if no objectList was found
     */
    public List<UserClass> getAllUser(){
        OISReadFile ois = new OISReadFile(fileName);
        List objectList = ois.getObjectList();
        List<UserClass> userList = new ArrayList<>();
        try{
            for(Object obj : objectList){
                UserClass user = (UserClass) obj;
                userList.add(user);
            }
            return userList;
        } catch(NullPointerException ex){
            return new ArrayList<>();
        }
    }
    
    
    public void setAllUser(List<UserClass> userList){
        OOSWriteFile oos = new OOSWriteFile(fileName);
        List<Object> objectList = new ArrayList<>();
        try{
            for(UserClass user : userList){
                Object obj = (Object) user;
                objectList.add(obj);
            }
            oos.writeObject(objectList);
        } catch(NullPointerException ex){
            System.out.println("User List Not Found");
        }
    }
    
    private void initialize(){
        OISReadFile ois = new OISReadFile("User.txt");
        try{
            List<Object> list = ois.getObjectList(username);
            UserClass customer = (UserClass) list.get(0);
            
            this.setRole(customer.getRole());
            this.setDob(customer.getDob());
            this.setEmail(customer.getEmail());
            this.setPhone(customer.getPhone());
            this.setName(customer.getName());
        } catch(IndexOutOfBoundsException | NullPointerException ex){
            System.out.println("No user found");
        }
    }
    
}

