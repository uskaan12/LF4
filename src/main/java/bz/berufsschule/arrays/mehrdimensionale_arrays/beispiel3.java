package bz.berufsschule.arrays.mehrdimensionale_arrays;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class beispiel3 {
    public static void main(String[] args) {

        //Wir erstellen ein zweidimensionales Array mit der Größe 3*3
        //welches unsere Spielkarte darstellt
        int[][] spielfeld = new int[3][3];

        //Wir füllen unsere Spielkarte mit Zahlen
        Random zufall = new Random();
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = zufall.nextInt(31) + 10;
            }
        }

        int versuche = 0; //Zählt wie lange wir brauchen bis wir bingo haben
        boolean bingo = false;
        while (!bingo) {//Die Schleife wird solange ausgeführt bis wir bingo haben

            //Hier wird die Zahl gezogen
            int zz = zufall.nextInt(31) + 10;

            //Hier wird überprüft ob wir die gezogene Zahl auf unserer Spielkarte
            //vorhanden ist, wenn ja ersetzen wir sie durch 0
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    if (spielfeld[i][j] == zz) {
                        spielfeld[i][j] = 0;
                    }
                }
            }
            versuche++;
            //Hier überprüfen wir ob wir Bingo haben
            if (spielfeld[0][0] == 0 && spielfeld[1][0] == 0 && spielfeld[2][0] == 0) {//vertikal 1
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[0][1] == 0 && spielfeld[1][1] == 0 && spielfeld[2][1] == 0) {//vertikal 2
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[0][2] == 0 && spielfeld[1][2] == 0 && spielfeld[2][2] == 0) {//vertikal 3
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[0][0] == 0 && spielfeld[0][1] == 0 && spielfeld[0][2] == 0) {//horizontal 1
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[1][0] == 0 && spielfeld[1][1] == 0 && spielfeld[1][2] == 0) {//horinzontal 2
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[2][0] == 0 && spielfeld[2][1] == 0 && spielfeld[2][2] == 0) {//horizontal 3
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[0][0] == 0 && spielfeld[1][1] == 0 && spielfeld[2][2] == 0) {//diagonal 1
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            } else if (spielfeld[2][0] == 0 && spielfeld[1][1] == 0 && spielfeld[0][2] == 0) {//diagonal 2
                System.out.println("Spieler hat BINGO!!");
                System.out.println("Der Spieler hat " + versuche + "benötigt");
                bingo = true;
            }


            //Ausgabe der Spiekarte
            System.out.println("Es wurde " + zz + " gezogen.");
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    System.out.print(spielfeld[i][j] + " ");
                }
                System.out.println("");
            }
            System.out.println("");
            System.out.println("------------------------------------------------");
            //Der Prozess wird für 1000ms pausiert
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(beispiel3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
