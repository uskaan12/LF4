package bz.berufsschule.for_schleife;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
    Zwei Spieler würfeln gegen einander. Jeder hat 50 Versuche und der Spieler
    das am Ende mehr Punkte hat, hat gewonnen. Wenn beide Spieler
    gleich viele Punkte haben, endet das Spiel unentschieden.
    Nach jeder Runde soll der Spielerstand in der Konsole angegeben werden. Dafür
    verwenden wir eine einfache grafische Balkendarstellung.
*/
public class wuerfelspiel3 {
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

            System.out.print("Spieler1 hat:" + spieler1 + "Punkte. ||");
            System.out.print("Spieler2 hat:" + spieler2 + "Punkte. ||");
            System.out.println(" ");
            for (int j = 0; j < rnd; j++) {
                spieler1Balken += "-";
            }
            for (int j = 0; j < rnd2; j++) {
                spieler2Balken += "-";

            }
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
