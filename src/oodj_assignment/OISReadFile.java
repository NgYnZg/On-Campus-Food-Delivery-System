/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YnZhong
 */
public class OISReadFile {
    
    //private final String filePath = "C:/Users/YnZhong/Desktop/";
    private final String filePath = System.getProperty("user.dir");
    private String fileName;
    private File f;
    
    public OISReadFile(String fileName){
        this.fileName = fileName;
        f = new File(filePath + File.separator + fileName);        
    }
    
    /**
     * Parse in one attribute (keyword1) (with existing get method in the object)
     * It will run every method that starts with "get" keyword
     * Stores every object that whichever get method returns the same value with keyword1 into a list
     * Return the list (with object type being Object)
     * Return empty list if no matched value
     * @param keyword1
     * @return A list of objects which its get method matches the keyword value
     */
    public List<Object> getObjectList(String keyword1){

        List<Object> objectList = new ArrayList<>();        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{
                    Object obj1 = ois.readObject();
                    
//                    Run every get method and compare the value with "keyword1"
                    for(Method m : obj1.getClass().getMethods()){
                        if(m.getParameterTypes().length == 0 && m.getName().startsWith("get")){
                            Object result = m.invoke(obj1);
                            if(result != null && result.equals(keyword1))
                                objectList.add(obj1);
                        }
                    }
                } catch(EOFException ex){
                    break;
                } catch (IllegalAccessException | InvocationTargetException ex) {
                    Logger.getLogger(OISReadFile.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            ois.close();
            fis.close();
            return objectList;
        } catch (IOException ex) {
            System.out.println("Object not found");
            return new ArrayList<>();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OISReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException ex){
            return new ArrayList<>();
        }
        return new ArrayList<>();
        
        
    }
    

//    Get all the objects, return empty list if no object found
    public List<Object> getObjectList(){

        List<Object> objectList = new ArrayList<>();        
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream(f);
        } catch (FileNotFoundException ex) {
            System.out.println("File not found");
        }
        try {
            ObjectInputStream ois = new ObjectInputStream(fis);
            while(true){
                try{
                    Object obj1 = ois.readObject();
                    objectList.add(obj1);
                    }catch(EOFException ex){
                    break;
                    }
            }
            ois.close();
            fis.close();
            return objectList;
        } catch (IOException ex) {
            System.out.println("Object not found");
            return new ArrayList<>();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(OISReadFile.class.getName()).log(Level.SEVERE, null, ex);
        } catch(NullPointerException ex){
            return new ArrayList<>();
        }
        return new ArrayList<>();
    }   
}
