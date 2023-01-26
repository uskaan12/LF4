package bz.berufsschule.test3;

import javax.swing.*;

public class aufgabe2 {
    public static void main(String[] args) {
        //user inputs how many produkts he has
        String input = JOptionPane.showInputDialog("Geben sie wie viele Werte eingelesen werden müssen");
        int number_of_products = Integer.parseInt(input);
        //make new array
        double[] array = new double[number_of_products];
        //fill array with users inputs
        double prize_of_products;
        for (int i = 0; i < array.length; i++) {
            String input1 = JOptionPane.showInputDialog("Geben sie den Preis des Produktes ab");
            prize_of_products = Double.parseDouble(input1);
            array[i] = prize_of_products;
        }
        double summ = 0;
        //calculates summ of the products
        for (int i = 0; i < array.length; i++) {
            summ = summ + array[i];
        }
        System.out.println("Die Summe der eingegebenen Produktpreisen lautet: " + summ);
    }
}
