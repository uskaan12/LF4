package bz.berufsschule.string_operationen;

import java.lang.*;
import javax.swing.*;

public class aufgabe_5_9 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Geben sie das Wort ein");

        // conversion from String object to StringBuffer
        StringBuffer rev = new StringBuffer(input);
        // To reverse the string
        rev.reverse();

        // check for palindrom
        if (input.equalsIgnoreCase(String.valueOf(rev))) {
            JOptionPane.showMessageDialog(null, "Die Wörter sind gleich.");
        } else {
            JOptionPane.showMessageDialog(null, "Die Wörter sind nicht gleich.");
        }
        /*
        Alternative
        char[] array = input.to CharArray();
        int i = 0;
        int j = array.lenght -1;
        boolean isPalindrom = true;

        while(i<j){
            if(array[i] != array[j]) {
                isPalindrome = false;
            }
            i++;
            j++;
        }
        if(isPalindrom) {
            System.out.println("Das Wort " +eingabe+ " ist ein Palindrom");
        }
        else {
            System.out.println("Das Wort " +eingabe+ " ist kein Palindrom");
        }
         */
    }
}
