package bz.berufsschule.arrays.mehrdimensionale_arrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class BattleShips {
    public static void main(String[] args) {

        //Auf diesem Spielfeld werden 5 kleine und 2 große Schiffe platziert (1 ist ein Schiff)
//        int[][] spielfeld = {{0,1,1,1,0,0,0,0,0,0},
//                             {0,0,0,0,0,0,0,0,0,0},
//                             {0,0,1,0,0,0,0,0,0,0},
//                             {0,0,0,0,0,0,0,0,0,0},
//                             {0,0,0,1,0,0,0,0,0,0},
//                             {0,0,0,0,0,0,0,0,0,0},
//                             {0,0,1,0,0,0,0,0,0,0},
//                             {0,0,0,0,0,0,1,0,0,0},
//                             {0,0,0,0,0,0,0,0,1,0},
//                             {0,0,1,1,1,0,0,0,0,0}};
        //Erstellen des leeren Spielfeldes
        int[][] spielfeld = new int[10][10];

        //Füllen des Spielfeldes mit 0
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = 0;
            }
        }

        //2 große Schiffe werden platziert
        Random zufall = new Random();
        for (int i = 0; i < 2; i++) {

            int x = zufall.nextInt(10);
            int y = zufall.nextInt(10);

            //Überprüfen ob Schiff platziert werden kann
            if (spielfeld[x][y] == 0 && y + 1 < 10 && y + 2 < 10 && spielfeld[x][y + 1] == 0 && spielfeld[x][y + 2] == 0) {
                spielfeld[x][y] = 1;
                spielfeld[x][y + 1] = 1;
                spielfeld[x][y + 2] = 1;
            } else {
                i--;
            }
        }
        //5 kleine Schiffe platzieren
        for (int i = 0; i < 5; i++) {

            int x = zufall.nextInt(10);
            int y = zufall.nextInt(10);

            //Überprüfen ob Schiff platziert werden kann
            if (spielfeld[x][y] == 0) {
                spielfeld[x][y] = 1;
            } else {
                i--; //Schleife muss einmal öfter wiederholt werden
            }
        }

        char[][] spielfeld_player_view = new char[10][10];
        for (int i = 0; i < spielfeld_player_view.length; i++) {
            for (int j = 0; j < spielfeld_player_view[i].length; j++) {
                spielfeld_player_view[i][j] = '-';
            }
        }

        //Spieler spiel solange bis alle Schiffe versenkt sind.
        int treffer = 0;
        int versuche = 0;
        while (treffer < 11) { // die Schleife wird solange augeführt bis alle Treffer gemacht wurden

            String eingabe1 = JOptionPane.showInputDialog("Bitte geben sie die X-Koordinate ein");
            String eingabe2 = JOptionPane.showInputDialog("Bitte geben Sie die Y-Koordinate ein");
            int x = Integer.parseInt(eingabe1);
            int y = Integer.parseInt(eingabe2);
            //Damit verhindern wir, dass der Spieler ungültige Koordinaten eingibt
            //bzw. Koorodinaten, die er bereits einmal eingegeben hat, verwendet
            if (x >= 0 && x <= 9 && y >= 0 && y <= 9 && spielfeld_player_view[x][y] != 'x' && spielfeld_player_view[x][y] != 'o') {

                if (spielfeld[x][y] == 1) {
                    System.out.println("Treffen!!!");
                    treffer++;
                    System.out.println("Es sind noch " + (11 - treffer) + " übrig!");
                    spielfeld[x][y] = 2; // 2 bedeutet bereits getroffen
                    spielfeld_player_view[x][y] = 'o';
                } else {
                    System.out.println("Daneben!!!");
                    spielfeld_player_view[x][y] = 'x';
                }
                versuche++;
            } else {
                System.out.println("Fehlerhafte eingabe!");
            }

            //Spielfeld mit Spieleransicht Ausgabe
            for (int i = 0; i < spielfeld_player_view.length; i++) {
                for (int j = 0; j < spielfeld_player_view[i].length; j++) {
                    System.out.print(spielfeld_player_view[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}