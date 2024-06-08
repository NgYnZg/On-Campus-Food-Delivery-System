/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Kristalle
 */
public class Authentication extends UserClass implements Serializable{
    
    private static final long serialVersionUID = 300868350964877598L;
    private final String fileName = "User.txt";

    public Authentication() {
        super();
    }

    public Authentication(String username, String password) {
        super(username, password);
    }

    public Authentication(String username, String password, String email) {
        super(username, password, email);
    }

    public Authentication(String username, String password, String email, String role) {
        super(username, password, email, role);
    }
    
    
    public boolean login(String enteredUsername, String enteredPassword) {
        OISReadFile reader = new OISReadFile(fileName);
        List<Object> userList = reader.getObjectList();

        for (Object obj : userList) {
            UserClass user = (UserClass) obj;
            if (enteredUsername.equals(user.getUsername()) && enteredPassword.equals(user.getPassword())) {
                return true; 
            }
        }

        return false;
    }
   
    
    public boolean resetPassword(String username, String email, String newPassword) {
        
        OISReadFile reader = new OISReadFile(fileName);
        List<Object> userList = reader.getObjectList();

        boolean userFound = false;

        for (Object obj : userList) {
            UserClass user = (UserClass) obj;
            if (username.equals(user.getUsername()) && email.equals(user.getEmail())) {
                userFound = true;
                user.setPassword(newPassword);
            }
        }

        if (userFound) {
            OOSWriteFile writer = new OOSWriteFile(fileName);
            writer.writeObject(userList);
            return true; 
        }

        return false; 
    }
}
