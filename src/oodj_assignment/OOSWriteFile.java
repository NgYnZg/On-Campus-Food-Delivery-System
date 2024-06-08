/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YnZhong
 */
public class OOSWriteFile {
    //private final String filePath = "C:/Users/YnZhong/Desktop/";
    //private final String filePath = "C:\\Users\\Desiree Tan\\OneDrive - Asia Pacific University\\Documents\\NetBeansProjects\\krisiree_oodj\\oodj";
    private final String filePath = System.getProperty("user.dir");
    //String filePath = System.getProperty("user.dir");
    private File f;
    
    //private final String filePath;

//    public OOSWriteFile(String fileName) {
//        this.filePath = System.getProperty("user.dir") + File.separator + fileName;
//    }
    
    public OOSWriteFile(String fileName){
        f = new File(filePath + File.separator + fileName);
    }
    
    
    public void writeObject(List objectList){
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(f);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(OOSWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for(Object obj : objectList){
                oos.writeObject(obj);
            }
            oos.close();
            fos.close();
        } catch (IOException ex) {
            Logger.getLogger(OOSWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public OOSWriteFile(String fileName, boolean append) {
        f = new File(filePath + File.separator +fileName);
    }
    
}
