package bz.berufsschule.while_schleife;

import java.util.Random;

/*
Erstelle ein Programm, das 20 Zufallszahlen zwischen 1 und 50 erzeugt und anschließend
den Durchschnitt dieser Zahlen berechnet und in der Konsole ausgibt.

1. Random Objekt erzeugen new Random()
2. Eine Variable zum Speicher der Summe der zwanzig Zahlen
3. Eine Schleife die 20 Zufallszählen generiert und diese addiert
4. Den Durchschnitt berechnen
5. Ausgabe

 */
public class aufgabe2 {
    public static void main(String[] args) {
        Random zufall = new Random();
        int zahlen = 0;
        for (int i = 1; i <= 20; i++) {
            int zufallszahl = zufall.nextInt(50) + 1;
            zahlen = zahlen + zufallszahl;
        }
        double durchschnitt = zahlen / 20.0;
        System.out.println("Der Durchschnitt der 20 Zahlen lautet: " + durchschnitt);
    }
}
