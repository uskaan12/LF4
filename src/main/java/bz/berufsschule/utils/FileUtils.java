
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
                ausgabe += scanner.next();
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        return ausgabe;
    }

    public static String textFromCredentials(String filename) {
        String ausgabe = "";
        try {
            int counter = 1;
            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (counter == 3) {
                    counter++;
                } else {
                    ausgabe += scanner.next();
                    counter++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }

        return ausgabe;
    }

    public static int passwdFromFile(String filename) {
        int zahl = 0;
        try {
            String temp = "";
            int counter = 1;

            File file = new File(filename);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                if (counter == 3) {
                    temp = scanner.next();
                    zahl = Integer.parseInt(temp);
                } else {
                    temp = scanner.next();
                    counter++;
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
        return zahl;
    }
}
