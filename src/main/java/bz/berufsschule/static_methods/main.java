package bz.berufsschule.static_methods;

import java.util.Random;

public class main {
    public static void main(String[] args) {
        int[] array1 = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] array2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        // Arrays in der Konsole ausgeben.
        ArrayUtils.print_Array_with_Blanks(array1);
        ArrayUtils.print_Array_with_Blanks(array2);
        // Erstelle ein Array mit länge 50 und fülle es mit Zufallszahlen zwischen 0 und 100
        // und gib es in der Konsole aus
        int[] array = new int[50];
        ArrayUtils.fill_array_with_random_numbers(array, 1, 100);
        ArrayUtils.print_Array_with_Blanks(array);
        //Gibt summe aller zahlen in Array aus
        int summe = ArrayUtils.sum_All_Values_In_Array(array);
        System.out.println("Die Summe aller Zahlen im Array lautet " + summe);
    }
}
