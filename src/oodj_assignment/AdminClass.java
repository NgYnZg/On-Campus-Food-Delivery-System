/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

/**
 *
 * @author Kristalle
 */


import java.io.Serializable;
import java.util.*;


public class AdminClass extends UserClass implements Serializable{
    
    private final String fileName = "User.txt";

    public AdminClass() {
        
    }
    
    public AdminClass(String username){
        super(username);
    }
        
    public AdminClass(String username, String password){
        super(username, password);
    }
    
    public AdminClass(String username, String name,String role, String password, 
            String email,  String phone, String dob){
        super(username,name,role,password,email,phone,dob);
    }
   
    // to display all the users
    public List<Object> getAllUserList() {
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList();
    }
    
    // to display only the searched user 
    public List<Object> getUser(String username){
        OISReadFile r = new OISReadFile(fileName);
        return r.getObjectList(username);
    }
    
    public List<Object> getAllTransaction(){
        OISReadFile r = new OISReadFile("Transaction.txt");
        return r.getObjectList();
    }
    

    // to add new user
    public void addUser(UserClass user) {
        try {
            OOSWriteFile oosWriteFile = new OOSWriteFile(fileName);
            List<Object> userList = getAllUserList();
            userList.add(user);
            oosWriteFile.writeObject(userList);
   
        } catch (Exception e) {

        }

    }
    
    
    public void addNewCus(CustomerClass cus){
        try {
            OOSWriteFile oos = new OOSWriteFile(fileName);
            List<Object> userList = getAllUserList();
            userList.add(cus);
            oos.writeObject(userList);
            
            CustomerCredit cusCredit = new CustomerCredit(cus.getUsername());
            OOSWriteFile oos1 = new OOSWriteFile("Transaction.txt");
            List<Object> cusList = getAllTransaction();
            cusList.add(cusCredit);
            oos1.writeObject(cusList);

        } catch (Exception e) {
            
        }
    }
    
    


    // to update existing user
    public void editUser(UserClass editedUser) {
        List<Object> userList = getAllUserList();
        for (Object obj : userList) {
            UserClass user = (UserClass) obj;
            if (user.getUsername().equals(editedUser.getUsername())) {
                user.setPassword(editedUser.getPassword());
                user.setName(editedUser.getName());
                user.setEmail(editedUser.getEmail());
                user.setDob(editedUser.getDob());
                user.setPhone(editedUser.getPhone());
            }
        }
        writeUserList(userList);
    }
    

    // to delete user
    public void deleteUser(String username) {
        List<Object> userList = getAllUserList();
        List<Object> updatedUserList = new ArrayList<>();
        for (Object obj : userList) {
            UserClass user = (UserClass) obj;
            if (!user.getUsername().equals(username)) {
                updatedUserList.add(user);
            }
        }
        writeUserList(updatedUserList);
    }


    private void writeUserList(List<Object> userList) {
        OOSWriteFile f = new OOSWriteFile(fileName);
        f.writeObject(userList);
    }
    
    
    public String generateUsername(String role) {
        String identifier = getIdentifier(role);
        List<Object> existingUsers = getUserListByRole(role);
        int nextNumber = getNextNumber(existingUsers);
        return identifier + String.format("%03d", nextNumber);
    }

    private String getIdentifier(String role) {
        switch (role) {
            case "Customer":
                return "CT";
            case "Vendor":
                return "VD";
            case "Runner":
                return "RN";
            case "Administrator":
                return "AD";
            default:
                throw new IllegalArgumentException("Invalid role");
        }
    }

    private List<Object> getUserListByRole(String role) {
        return getUser(role);
    }

    private int getNextNumber(List<Object> existingUsers) {
        int maxNumber = 0;
        for (Object obj : existingUsers) {
            UserClass user = (UserClass) obj;
            int number = Integer.parseInt(user.getUsername().substring(2));
            maxNumber = Math.max(maxNumber, number);
        }
        return maxNumber + 1;
    }
    
}
