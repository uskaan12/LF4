
package bz.berufsschule.utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
    
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

    public static void writeTextToFile(String filename, String text){
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(filename);
            myWriter.write(text);
            myWriter.close();
        } catch (Exception e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
}
