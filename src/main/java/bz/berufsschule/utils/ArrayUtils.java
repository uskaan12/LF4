
package bz.berufsschule.utils;

import java.util.Random;

public class ArrayUtils {

    //Methode um ein Array in der Konsole auszugeben
    public static void print_Array_With_Blanks(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    //Methode zum Füllen eine Arrays mit Zufallszahlen in einem bestimmten Bereich
    public static void fill_Array_With_Random_Numbers(int[] array, int min, int max) {

        Random zufall = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = zufall.nextInt(max - min + 1) + min;
        }
    }

    //Methode um die Summe aller Zahlen in einem Array zu berrechnen
    public static int sum_All_Values_In_Array(int[] array) {

        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        return summe;
    }

    //Methode, die das kleinste Element in einem Array sucht und zurückgibt
    public static int find_Smallest_Element(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    //Eine Methode, die das größte Element in einem Array sucht und zurückgibt
    public static int find_Largest_Element(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    //Eine Methode, die den Durchschnittwert aller Elemente im Array ermittelt
    //und zurückgibt
    public static double calculate_Average_Of_All_Elements(int[] array) {

        double summe = sum_All_Values_In_Array(array);
        double avg = summe / array.length;
        return avg;
    }

    public static void writeArrayToFile(String filename, int[] array) {
        String ausgabe = "";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                ausgabe = ausgabe + array[i];
            } else {
                ausgabe = ausgabe + array[i] + ",";
            }
        }
        FileUtils.writeTextToFile(filename,ausgabe);
    }
}
