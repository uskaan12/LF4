package bz.berufsschule.verzweigungen;

import java.util.Random;

public class kleinsteZahl_2_34 {
    public static void main(String[] args) {
        Random zufallsgenerator = new Random();
        int a = zufallsgenerator.nextInt(1000000) + 1;
        int b = zufallsgenerator.nextInt(1000000) + 1;
        int c = zufallsgenerator.nextInt(1000000) + 1;
        System.out.println(Math.min(Math.min(a, b), c));
        //System.out.println(a + " " + b + " " + c);
    }
}
