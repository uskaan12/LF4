package bz.berufsschule.string_operationen;

import javax.swing.*;
import java.util.Random;

public class mastermind_simple {
    public static void main(String[] args) {
        System.out.println("Das Spiel beinhaltet acht Farben, wobei diese durch die Ziffern 1-8 dargestellt werden.");
        System.out.println("Versuchen sie den vierstelligen computergenerierten code zu erraten");

        //generate color code
        int[] color_code = new int[4];
        for (int i = 0; i < color_code.length; i++) {
            int generated = (int) ((Math.random() * 8) + 1);
            boolean already_used = false;
            //check if generated number is already used, if yes a new number will be generated, if not we save the number
            for (int j = 0; j < color_code.length; j++) {
                if (color_code[j] == generated) {
                    already_used = true;
                }
            }
            if (already_used) {
                i--;
            } else {
                color_code[i] = generated;
            }
        }
        int remaining = 10;
        while (remaining > 0) {
            //User input for the code
            String input = JOptionPane.showInputDialog("Geben sie den Code ein.     Verbliebene Versuche " + remaining);
            remaining--;
            //check code - if player gets a number wrong output is b(black),
            //if player gets the number in the wrong place output is w(white),
            //if number is in the right place output is g(green)


        }

    }
}
