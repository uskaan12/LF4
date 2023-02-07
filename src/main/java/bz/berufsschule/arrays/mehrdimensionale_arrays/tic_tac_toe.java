package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;

// Tic Tac Toe mit 2D-Array das ein 3x3 Feld darstellt uns 2 Spieler (X und O) die abwechselnd ihre Symbole eintragen können
public class tic_tac_toe {
    public static void main(String[] args) {

        // erzeuge spielfeld als 3x3 char-Array
        char[][] spielfeld = new char[3][3];

        // While Schleife die, solange läuft bis ein Spieler gewonnen hat
        boolean gewonnen = false;
        while (!gewonnen) {
            // Spieler 1 ist dran
            // Eingabe abfragen
            String eingabe = JOptionPane.showInputDialog("Spieler 1: Bitte gib eine Zahl zwischen 1 und 9 ein");
            int eingabe_Spieler1 = Integer.parseInt(eingabe);
            // Eingabe in das Spielfeld eintragen
            if (eingabe_Spieler1 == 1) {
                spielfeld[0][0] = 'X';
            } else if (eingabe_Spieler1 == 2) {
                spielfeld[0][1] = 'X';
            } else if (eingabe_Spieler1 == 3) {
                spielfeld[0][2] = 'X';
            } else if (eingabe_Spieler1 == 4) {
                spielfeld[1][0] = 'X';
            } else if (eingabe_Spieler1 == 5) {
                spielfeld[1][1] = 'X';
            } else if (eingabe_Spieler1 == 6) {
                spielfeld[1][2] = 'X';
            } else if (eingabe_Spieler1 == 7) {
                spielfeld[2][0] = 'X';
            } else if (eingabe_Spieler1 == 8) {
                spielfeld[2][1] = 'X';
            } else if (eingabe_Spieler1 == 9) {
                spielfeld[2][2] = 'X';
            }

            // Spielfeld ausgeben
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    System.out.print(spielfeld[i][j] + " ");
                }
                System.out.println();
            }
            // prüfen ob jemand gewonnen hat
            // Spieler 2 ist dran
            // Eingabe abfragen
            String eingabe2 = JOptionPane.showInputDialog("Spieler 2: Bitte gib eine Zahl zwischen 1 und 9 ein");
            int eingabe_Spieler2 = Integer.parseInt(eingabe2);
            // Eingabe in das Spielfeld eintragen
            if (eingabe_Spieler2 == 1) {
                spielfeld[0][0] = 'O';
            } else if (eingabe_Spieler2 == 2) {
                spielfeld[0][1] = 'O';
            } else if (eingabe_Spieler2 == 3) {
                spielfeld[0][2] = 'O';
            } else if (eingabe_Spieler2 == 4) {
                spielfeld[1][0] = 'O';
            } else if (eingabe_Spieler2 == 5) {
                spielfeld[1][1] = 'O';
            } else if (eingabe_Spieler2 == 6) {
                spielfeld[1][2] = 'O';
            } else if (eingabe_Spieler2 == 7) {
                spielfeld[2][0] = 'O';
            } else if (eingabe_Spieler2 == 8) {
                spielfeld[2][1] = 'O';
            } else if (eingabe_Spieler2 == 9) {
                spielfeld[2][2] = 'O';
            }
            // Spielfeld ausgeben
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    System.out.print(spielfeld[i][j] + " ");
                }
                System.out.println();
            }
        }
        // zwei Spieler die abwechselnd dran sind

        // Eingabe abfragen

        // X und O im Spieldfeld eintragen

        // spielfeld ausgeben

        // prüfen ob jemand gewonnen hat
    }
}
