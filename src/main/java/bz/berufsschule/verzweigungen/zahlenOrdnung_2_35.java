package bz.berufsschule.verzweigungen;

import java.util.Random;

public class zahlenOrdnung_2_35 {
    public static void main(String[] args) {
        Random zufallsgenerator = new Random();
        int a = zufallsgenerator.nextInt(1000000) + 1;
        int b = zufallsgenerator.nextInt(1000000) + 1;
        int c = zufallsgenerator.nextInt(1000000) + 1;
        int min, max, med;
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    med = b;
                    min = c;
                } else {
                    med = c;
                    min = b;
                }
            } else {
                med = a;
                max = c;
                min = b;
            }
        } else {
            if (b > c) {
                max = b;
                if (a > c) {
                    med = a;
                    min = c;
                } else {
                    med = c;
                    min = a;
                }
            } else {
                med = b;
                max = c;
                min = a;
            }
        }
        System.out.println(min + " " + med + " " + max);
    }
}
