package bz.berufsschule.string_operationen;

import javax.swing.*;

public class caesar_cipher {
    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Geben sie das Wort den sie verschlüsseln/entschlüsseln wollen ein");
        String input2 = JOptionPane.showInputDialog("wollen sie entschluesseln oder verschluesseln?");
        String input3 = JOptionPane.showInputDialog("Nach wie viele Buchstabe wird es verstellt?");

        int zahl = Integer.parseInt(input3);

        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (input2.equalsIgnoreCase("entschluesseln")) {
                System.out.print(array[i] = (char) (array[i] - zahl));
            } else {
                System.out.print(array[i] = (char) (array[i] + zahl));
            }
        }
    }
}


