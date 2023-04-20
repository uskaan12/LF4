package bz.berufsschule.test_sem2_2;

public class ZahlenSieb {
    public static void sortieren(int zahl1, int zahl2, int zahl3) {
        if (zahl1 < zahl2) {
            if (zahl2 < zahl3) {
                System.out.println(zahl1 + " " + zahl2 + " " + zahl3);
            } else {
                System.out.println(zahl1 + " " + zahl3 + " " + zahl2);
            }
        } else if (zahl1 > zahl2) {
            if (zahl1 < zahl3) {
                System.out.println(zahl2 + " " + zahl1 + " " + zahl3);
            } else {
                System.out.println(zahl2 + " " + zahl3 + " " + zahl1);
            }
        } else {
            if (zahl1 < zahl2) {
                System.out.println(zahl3 + " " + zahl1 + " " + zahl2);
            } else {
                System.out.println(zahl3 + " " + zahl2 + " " + zahl1);
            }
        }
    }

    public static void filtern(int[] array, int zahl) {
        String ausgabe = "";
        for (int num : array) {
            if (num >= zahl) {
                ausgabe += String.valueOf(num) + " ";
            }
        }
        System.out.println(ausgabe);
    }
}
