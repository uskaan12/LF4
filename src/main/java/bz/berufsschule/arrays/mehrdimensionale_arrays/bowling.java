package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;

/*
 Highscore Board: In einer von Benutzer definierten Matrix, dh der Spieler gibt ein wie viele
 Spieler mitmachen und wie viele Runden pro Spieler gespielt werden
 Anschließend werden die Spielrunden simuliert in dem wir Randomzahlen zwischen 1 und 9 generieren
 Schreibe ein Programm, das den Gewinner aus einer solchen Spielkarte ermitterlt
 */
public class bowling {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Wie viele Spieler?");
        int spieler = Integer.parseInt(eingabe);
        String eingabe2 = JOptionPane.showInputDialog("Wie viele Runden?");
        int runden = Integer.parseInt(eingabe2);
        int[][] highscore = new int[spieler][runden];

        // fill the array with random numbers between 1 and 9
        for (int i = 0; i < spieler; i++) {
            for (int j = 0; j < runden; j++) {
                highscore[i][j] = (int) (Math.random() * 9 + 1);
            }
        }

        // print the array
        for (int i = 0; i < spieler; i++) {
            for (int j = 0; j < runden; j++) {
                System.out.print(highscore[i][j] + " ");
            }
            System.out.println();
        }

        // find the winner
        int[] summen = new int[spieler];
        for (int i = 0; i < spieler; i++) {
            int summe = 0;
            for (int j = 0; j < runden; j++) {
                summe += highscore[i][j];
            }
            summen[i] = summe;
        }
        // find the highest score
        int highest = 0;
        for (int i = 0; i < summen.length; i++) {
            if (summen[i] > highest) {
                highest = summen[i];
            }
        }
        // find the player with the highest score
        for (int i = 0; i < summen.length; i++) {
            if (summen[i] == highest) {
                System.out.println(" ");
                System.out.println("Der Gewinner ist Spieler " + (i + 1) + " mit " + highest + " Punkten");
            }
        }
    }
}
