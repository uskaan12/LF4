
package bz.berufsschule.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileUtils {

    public static void CreateFile(String filename) {

        try {
            File file = new File(filename);

            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException ex) {

        }
    }

    public static void writeTextToFile(String filename, String text) {
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(filename);
            myWriter.write(text);
            myWriter.close();
        } catch (Exception e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }

    public static String textFromFile(String filename) {
        String ausgabe = "";
        try {
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                ausgabe += scanner.nextLine();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        return ausgabe;
    }
}
