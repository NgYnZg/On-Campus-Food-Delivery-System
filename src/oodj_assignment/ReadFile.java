/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj_assignment;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


/**
 *
 * @author YnZhong
 */


public class ReadFile {
    
    private static String[] errorWhileFinding = new String[1];
//    private final static String filePath = "D:\\Download (D)\\apu OODJ\\assignment\\krisiree_oodj\\oodj";
    private final static String filePath = System.getProperty("user.dir");
    //private final static String filePath = "C:/Users/YnZhong/Desktop/";
    
    
    
    
//readLine method is used to return a specific line from the text file with 2 keywords 
//one being the initial keyword, another is used to verify the legitimacy of the line.
// able to display which part did not fulfill the verification
    public static String[] readLine(String initialKeyword, int indexOfInitial, String verificationKeyword, int indexOfVerify, String fileName){
        
        int incorrectVerificationCount = 0;
        
        try{
//            Instantiate file class and scanner class to read file
            File file = new File(filePath + fileName);
            if(!file.exists()){
            String[] output = {"File Not Found3"};
            return output;
            }
            
            Scanner readfile = new Scanner(file);
            
//            Reads ONE line one at a time to search for matching keywords
//            returns the matching line in array
            while(readfile.hasNextLine()){
                String data = readfile.nextLine();
                
                String[] splitDataArr = data.split(" ; ");

                
                if (splitDataArr[indexOfInitial].equals(initialKeyword)){
                    if(splitDataArr[indexOfVerify].equals(verificationKeyword)){
                        incorrectVerificationCount = -1;
                        return splitDataArr;
                    }
                    incorrectVerificationCount += 1;
                }   
            }
            readfile.close();
            
//            Check incorrect verificationKeyword when: login(credential, password) / get customer credit (name, role = Customer)
            if (incorrectVerificationCount>0){
                errorWhileFinding[0] = "Incorrect verificationKeyword";
                return errorWhileFinding;
            }
//            Check incorrect initialKeyword input
            else if (incorrectVerificationCount == 0){
                errorWhileFinding[0] = "Incorrect initialKeyword";
                return errorWhileFinding;
            }
        }catch(FileNotFoundException e){
            String[] output = {"File Not Found"};
            System.out.println("File Not Found1");
            return output;
        }
        return null;
    }
    
    //overloads from the readLine method above, but it takes THREE keywords
    //returns the line of matching data or {"Not found"} if there is no matching data
    public static String[] readLine(String initialKeyword, int indexOfInitial, String firstVerificationKeyword, int indexOfFirstVerify, String secondVerificationKeyword, int indexOfSecondVerify, String fileName, int ncol){
        try{
            File file = new File(filePath + fileName);
            try(Scanner readfile = new Scanner(file)){
                while(readfile.hasNextLine()){
                    String data = readfile.nextLine();
                    String[] splitDataArr = data.split(" ; ");
                    if (splitDataArr[indexOfInitial].equals(initialKeyword) & splitDataArr[indexOfFirstVerify].equals(firstVerificationKeyword ) & splitDataArr[indexOfSecondVerify].equals(secondVerificationKeyword )){
                        return splitDataArr;
                    }
                }
            }
        }catch (FileNotFoundException e){
                System.out.println("File Not Found in Scanner");
        }
        errorWhileFinding[0] = "Not Found";
        return errorWhileFinding;
    }
    
    
    
    
    
//    Load text in order to be replaced in the WriteFIle.Overwrite method
    public static String loadOldContent(String fileName){
        
//        Instantiate StringBuffer class to load the contents of the file
        StringBuffer buffer = new StringBuffer();
        
        try{
            
//            Instantiate File and Scanner class to read the file
            File file = new File(filePath + fileName);
            if (!file.exists()){
                System.out.println("File not found");
                return "File not found";
            }
            Scanner readfile = new Scanner(file);
//            System.out.println("Scnner: " + readfile.nextLine());
//            Appends the content of the file into StringBuffer
            while(readfile.hasNextLine()){
                buffer.append(readfile.nextLine()).append(System.lineSeparator());
            }
            
//            Return the contents
            String fileContent = buffer.toString();
            readfile.close();
            return fileContent;
        } catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return null;
    }
    
}
