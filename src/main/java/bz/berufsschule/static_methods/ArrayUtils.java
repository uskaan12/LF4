package bz.berufsschule.static_methods;

import java.util.Random;

public class ArrayUtils {
    public static void print_Array_with_Blanks(int[] array) {
        for (int j : array) {
            System.out.println(j + " ");
        }
        System.out.println("");
    }

    public static void fill_array_with_random_numbers(int array[], int min, int max) {
        Random zufall = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = zufall.nextInt(max - min + 1) + min;
        }
    }

    public static int sum_All_Values_In_Array(int array[]) {
        int summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe = +array[i];
        }
        return summe;
    }

    public static int min_number_In_Array(int array[]) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int max_number_In_Array(int array[]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    public static int average_number_In_Array(int array[]) {
        int summe = sum_All_Values_In_Array(array);
        int avg = summe / array.length;
        return avg;
    }
}

