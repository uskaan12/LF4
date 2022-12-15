package bz.berufsschule.test2;

import javax.swing.*;
import java.util.Random;

public class aufgabe5 {
    public static void main(String[] args) {
        int points1 = 0;
        int points2 = 0;
        String player1 = JOptionPane.showInputDialog("Spieler1 bitte geben sie ihren Benutzernamen ein:");
        String player2 = JOptionPane.showInputDialog("Spieler2 bitte geben sie ihren Benutzernamen ein:");
        boolean wiederholen = true;
        while (wiederholen) {
            Random random = new Random();
            int rnd = random.nextInt(6) + 1;
            int rnd2 = random.nextInt(6) + 1;
            int rnd3 = random.nextInt(6) + 1;
            int rnd4 = random.nextInt(6) + 1;
            int rnd5 = random.nextInt(6) + 1;
            int rnd6 = random.nextInt(6) + 1;
            if (rnd == rnd2 && rnd2 == rnd3) {
                points1 = rnd * 2 + rnd2 * 2 + rnd3 * 2;
            } else if (rnd4 == rnd5 && rnd5 == rnd6) {
                points2 = rnd4 * 2 + rnd5 * 2 + rnd6 * 2;
            } else if (points1 >= 200) {
                wiederholen = false;
            } else if (points2 >= 200) {
                wiederholen = false;
            }
        }
    }
}
