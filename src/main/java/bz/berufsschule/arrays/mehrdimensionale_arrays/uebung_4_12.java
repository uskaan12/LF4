package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;

public class uebung_4_12 {
    public static void main(String[] args) {
        String eingabe1 = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:");
        int zahl1 = Integer.parseInt(eingabe1);
        String eingabe2 = JOptionPane.showInputDialog("Geben Sie eine Zahl ein:");
        int zahl2 = Integer.parseInt(eingabe2);
        int[][] array = new int[zahl1][zahl2];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (i + 1) * 10 + (j + 1);
            }

        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
