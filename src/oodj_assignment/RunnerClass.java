/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author Kristalle
 */
public class RunnerClass extends UserClass{
    
    private String runnerStatus;
    
    public RunnerClass(String username){
        super(username);
        initialize();
    }
    
    public RunnerClass(String username, String password){
        super(username, password);
    }
    
    public RunnerClass(String username,String name, String role, String password, String email,  String phone, String dob) {
        super(username, name, role, password, email, phone, dob);
    }

    public String getRunnerStatus() {
        return runnerStatus;
    }

    public void setRunnerStatus(String runnerStatus) {
        this.runnerStatus = runnerStatus;
    }
    
    public void initialize(){
        OISReadFile ois = new OISReadFile("User.txt");
        try{
            List<Object> list = ois.getObjectList(super.getUsername());
            RunnerClass runner = (RunnerClass) list.get(0);
            
            super.setRole(runner.getRole());
            super.setDob(runner.getDob());
            super.setEmail(runner.getEmail());
            super.setPhone(runner.getPhone());
            super.setName(runner.getName());
            this.runnerStatus = runner.getRunnerStatus();
        } catch(IndexOutOfBoundsException | NullPointerException ex){
            System.out.println("No user found");
        }
    }
}
