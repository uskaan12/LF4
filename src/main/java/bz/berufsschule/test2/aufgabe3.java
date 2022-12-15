package bz.berufsschule.test2;

import java.util.Random;

public class aufgabe3 {
    public static void main(String[] args) {
        Random zufall = new Random();
        int zz = zufall.nextInt(7) + 3;
        System.out.println("Die Zufallszahl lautet: " + zz);
        for (int i = 50; i >= 3; i--) {
            if (i % zz == 0) {
                System.out.printf(i + " ");
            }
        }
    }
}
