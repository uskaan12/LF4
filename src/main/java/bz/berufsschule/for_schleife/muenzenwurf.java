package bz.berufsschule.for_schleife;

import java.util.Random;

public class muenzenwurf {
    public static void main(String[] args) {
        /*
        Erstelle ein Programm
        0 --> Kopf, 1 --> Zahl
         */
        int kopf = 0;
        int zahl = 0;
        Random zufall = new Random();
        for (int i = 1; i <= 100; i++){
            int wurfergebnis = zufall.nextInt(2);
            if (wurfergebnis == 0) {
                kopf++;
            } else {
                zahl++;
            }
        }
        System.out.println("Kopf: " + kopf);
        System.out.println("Zahl: " + zahl);
    }
}
