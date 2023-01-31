package bz.berufsschule.test3;

import javax.swing.*;

public class aufgabe4 {
    public static void main(String[] args) {
        String inputa = JOptionPane.showInputDialog("Geben sie wie viele Werte eingelesen werden müssen (array a)");
        int array_length_a = Integer.parseInt(inputa);
        String inputb = JOptionPane.showInputDialog("Geben sie wie viele Werte eingelesen werden müssen (array b)");
        int array_length_b = Integer.parseInt(inputb);
        //calculates length for arrayc
        int array_length_c = array_length_a + array_length_b;
        //make new array
        int[] array_a = new int[array_length_a];
        int[] array_b = new int[array_length_b];
        int[] array_c = new int[array_length_c];
        //fill arrays
        int value_a;
        for (int i = 0; i < array_a.length; i++) {
            String input1 = JOptionPane.showInputDialog("Geben sie ein Wert ein (array a)");
            value_a = Integer.parseInt(input1);
            array_a[i] = value_a;
        }
        int value_b;
        for (int i = 0; i < array_b.length; i++) {
            String input2 = JOptionPane.showInputDialog("Geben sie ein Wert ein (array b)");
            value_b = Integer.parseInt(input2);
            array_b[i] = value_b;
        }
        //combine arrays a and b in c and sort them
        int a = 0;
        int b = 0;
        int zaehlera = 0;
        int zaehlerb = 0;
        for (int i = 0; i < array_c.length; i++) {
            if (zaehlera < array_a.length) {
                a = array_a[zaehlera];
            }
            if (zaehlera < array_b.length) {
                b = array_b[zaehlerb];
            }
            if (a == b) {
                array_c[i] = a;
                zaehlera++;
                zaehlerb++;
            } else if (a < b) {
                array_c[i] = a;
                zaehlera++;
            } else {
                array_c[i] = b;
                zaehlerb++;
            }
            System.out.println(array_c[i]);
        }
    }
}