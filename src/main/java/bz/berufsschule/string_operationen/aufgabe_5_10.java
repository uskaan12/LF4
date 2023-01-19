package bz.berufsschule.string_operationen;

import javax.swing.*;

public class aufgabe_5_10 {
    public static void main(String[] args) {
        //User input for the mathematical expression
        String input = JOptionPane.showInputDialog("Geben sie den Term ein");
        //Input is transformed in Char array
        char[] array = input.toCharArray();
        //rounded brackets counter
        int round_brackets = 0;
        //For loop that goes through array
        for (int i = 0; i < array.length; i++) {
            //Check for brackets and change the counter
            if (array[i] == '(') {
                round_brackets++;
            } else if (array[i] == ')') {
                round_brackets--;
            }
        }
        //if brackets is 0 we have the same amount of opening and closing brackets
        if (round_brackets==0){
            System.out.println("Der Term " + input + " ist in ordnung");
        } else {
            System.out.println("Der Term " + input + " ist nicht in ordnung");
        }
    }
}
