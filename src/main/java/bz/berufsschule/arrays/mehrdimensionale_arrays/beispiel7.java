package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;
import java.util.Arrays;

//sehr einfaches Schiffe versenken Spiel. Das Programm generiert ein 10x10 Feld und platziert 5 kleine Schiffe (1 Feld groß) und 2 große Schiffe (3 Felder groß). Es wird anschließend solange gespielt bis Der Spieler alle Schiffe versenkt hat. Es wreden die benötigte versuche ausgegeben
public class beispiel7 {
    public static void main(String[] args) {
        //Erstellen des Spielfeldes
        char[][] board = new char[10][10];
        //Füllen des Spielfeldes mit Wasser
        for (char[] chars : board) {
            Arrays.fill(chars, '~');
        }
        //Platzieren der Schiffe
        //Platzieren der kleinen Schiffe
        for (int i = 0; i < 5; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            if (board[x][y] == 'S') {
                i--;
            } else {
                board[x][y] = 'S';
            }
        }
        //Platzieren der großen Schiffe
        for (int i = 0; i < 2; i++) {
            int x = (int) (Math.random() * 10);
            int y = (int) (Math.random() * 10);
            if (board[x][y] == 'S') {
                i--;
            } else {
                board[x][y] = 'S';
                if (x + 1 < 10) {
                    board[x + 1][y] = 'S';
                }
                if (x - 1 >= 0) {
                    board[x - 1][y] = 'S';
                }
                if (y + 1 < 10) {
                    board[x][y + 1] = 'S';
                }
                if (y - 1 >= 0) {
                    board[x][y - 1] = 'S';
                }
            }
        }
        //Spielen
        int versuche = 0;
        boolean gewonnen = false;
        while (!gewonnen){
            //Ausgabe des Spielfeldes
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
            //Eingabe der Koordinaten
            int x = Integer.parseInt(JOptionPane.showInputDialog("Gib die x-Koordinate ein"));
            int y = Integer.parseInt(JOptionPane.showInputDialog("Gib die y-Koordinate ein"));
            //Prüfen ob ein Schiff getroffen wurde
            if (board[x][y] == 'S'){
                board[x][y] = 'X';
                versuche++;
            }else if (board[x][y] == '~'){
                board[x][y] = 'O';
                versuche++;
            }
            //Prüfen ob alle Schiffe versenkt wurden
            gewonnen = true;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == 'S'){
                        gewonnen = false;
                    }
                }
            }
        }
    }
}
