package bz.berufsschule.verzweigungen_INF2A;

import java.util.Random;

public class zufallszahlen {
    public static void main(String[] args) {
        //Erstelle ein Programm, das eine Zufallszahl zwischen 1 und 10 erzeugt.
        //System.currentTimeMillis gibt die Anzahl der Millisekunden zurück, die seit 1970 vergangen sind.
        //System.out.println(System.currentTimeMillis());

        //Zufallszahlen können mit der Klasse Random einfach und schnell erzeugt werden.
        //Mit diesem Befehl wird ein Zufallsgenerator für Zahlen erstellt.
        Random zufallsgenerator = new Random();

        /*Dieser Befehl erzeugt eine Zufallszahl mit der Obergrenze 10.
            Allerdings erzeugt dieser Befehl nur Zahlen von 0 bids 9, die Obergrenze von
            10 wird aufgrund der Integer-Division nie erreicht.
            Deshalb zählen wir zur generierten Zufallszahl einfach 1 dazu und damit
            erhalten wir dnn Zufallszahlen von 1 bis 10
         */
        int zufallszahl = zufallsgenerator.nextInt(10) + 1;
        /*
            Aufgabe:
            Wenn die Zufallszahl größer als 8 ist, dann bekommt der Benutzer 100 Punkte.
            Wenn die Zufallszahl zwischen 4 und 8 ist, dann bekommt der Benutzer 30 Punkte.
            Wenn die Zufallszahl kleiner als 4 ist, dann bekommt der Benutzer 5 Punkte.
         */

        if (zufallszahl > 8) {
            System.out.println("Sie bekommen 100 Punkte");
        } else if (zufallszahl < 4) {
            System.out.println("Sie bekommen 5 Punkte");
        } else {
            System.out.println("Sie bekommen 30 Punkte");
        }

        /* Allgemeine Formel für Zufallszahlen aus einem bestimmten intervall:

            int zufallszahl = zufallsGenerator.nextInt(max-min+1)+min;

            Zum Beispiel Zahlen zwischen 100 und 350 wäre dann
            int zufallszahl = zufallsGenerator.nextInt(251)+100;

            ein weiteres Beispiel: Zahlen zwischen -100 und 200
            int zufallszahl = zufallsGenerator.nextInt(101)-100;

         */
    }
}
