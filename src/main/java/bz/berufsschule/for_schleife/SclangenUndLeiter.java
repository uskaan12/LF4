package bz.berufsschule.for_schleife;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SclangenUndLeiter {
    public static void main(String[] args) {
        int spieler1 = 0;
        int spieler2 = 0;
        String spieler1Balken = " ";
        String spieler2Balken = " ";

        for (int i = 0; i < 10; i++) {
            Random random = new Random();
            Random random2 = new Random();
            int rnd = random.nextInt(6) + 1;
            int rnd2 = random2.nextInt(6) + 1;
            spieler1 = spieler1 + rnd;
            spieler2 = spieler2 + rnd2;
            for (int j = 0; j < rnd; j++) {
                spieler1Balken += "-";
            }
            for (int j = 0; j < rnd2; j++) {
                spieler2Balken += "-";
            }
            if (spieler1 == 19) {
                spieler1 = 66;
                for (int j = 0; j < 47; j++) {
                    spieler1Balken += "-";
                }
            } else if (spieler1 == 67) {
                spieler1 = 100;
                for (int j = 0; j < 33; j++) {
                    spieler1Balken += "-";
                }
            } else if (spieler1 == 32) {
                spieler1 = 53;
                for (int j = 0; j < 21; j++) {
                    spieler1Balken += "-";
                }
            } else if (spieler1 == 73) {
                spieler1 = 91;
                for (int j = 0; j < 18; j++) {
                    spieler1Balken += "-";
                }
            } else if (spieler1 == 88) {
                spieler1 = 71;
                spieler1Balken = spieler1Balken.substring(0, spieler1);
            } else if (spieler1 == 74) {
                spieler1 = 52;
                spieler1Balken = spieler1Balken.substring(0, spieler1);
            } else if (spieler1 == 46) {
                spieler1 = 12;
                spieler1Balken = spieler1Balken.substring(0, spieler1);
            } else if (spieler1 == 25) {
                spieler1 = 6;
                spieler1Balken = spieler1Balken.substring(0, spieler1);
            }
            System.out.print("Spieler1 hat:" + spieler1 + "Punkte. ||");
            System.out.print("Spieler2 hat:" + spieler2 + "Punkte. ||");
            System.out.println(" ");

            System.out.println("Spieler1:" + spieler1Balken);
            System.out.println("Spieler2" + spieler2Balken);


            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(wuerfelspiel3.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        System.out.println(" ");


        if (spieler1 < spieler2) {
            System.out.println("Spieler2 hat mit " + spieler2 + " Punkten das Spiel gewonnen!");
        } else if (spieler1 > spieler2) {
            System.out.println("Spieler1 hat mit " + spieler1 + " Punkten das Spiel gewonnen!");
        } else {
            System.out.println("Die Spieler haben gleiche Punkte. Unendschieden!");
        }
    }
}
