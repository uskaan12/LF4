/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.utils;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author INF2A_Folie
 */
public class FileWriter {
    
    public static void CreateFile(String filename) {
        
        try {
            File file = new File(filename);
            
            if(file.createNewFile()){
                System.out.println("File created: " +file.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch (IOException ex){
            
        } 
    }  
}
