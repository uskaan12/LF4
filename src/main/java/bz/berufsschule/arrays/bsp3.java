package bz.berufsschule.arrays;

/*
    Erstelle 7 Zufallszahlen zwischen 1 und 90 und speichere sie in einem Integer-Array.
    Gib diese anschließend nach dem folgenden Muster aus:
    Ihr Tipp lautet: zahl1-zahl2-zahl3-zahl4-zahl5-zahl6 Superstar:zahl7
 */
public class bsp3 {
    public static void main(String[] args) {
        // Erstelle ein Integer-Array der Länge 7
        int[] lottotipp = new int[7];
        // Füllt es mit Zufallszahlen zwischen 1 und 90
        for (int i = 0; i < lottotipp.length; i++) {
            lottotipp[i] = (int) (Math.random() * 90) + 1;
        }
        // Gib die Zahlen aus
        System.out.print("Ihr Tipp Lautet: ");
        System.out.println("Ihr Tipp lautet: " + lottotipp[0] + "-" + lottotipp[1] + "-" + lottotipp[2] + "-" + lottotipp[3] + "-" + lottotipp[4] + "-" + lottotipp[5] + " Superstar: " + lottotipp[6]);
    }
}
