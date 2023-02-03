package bz.berufsschule.arrays.eindimensionale_arrrays;

import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

/*
Erstelle ein Double-Array mit 50 Werten von 0.0 - 1.0
Finde die größte und die kleinste Zahl im Array und gib diese in der Konsole aus.
Bestimme den Durchschnittswert des Arrays und zähle wie viele Werte darüber bzw darunter liegen.
Am Ende soll der Benutzer entscheiden können ob das Programm wiederholt oder beendet werden soll.
 */
public class bsp6 {
    public static void main(String[] args) {
        Random zufall = new Random();
        boolean neustart = true;
        while (neustart) {
            //Array erstellen
            double[] array = new double[50];

            //Array füllen
            for (int i = 0; i < array.length; i++) {
                array[i] = Math.round(zufall.nextDouble() * 100) / 100.0;
            }

            //kleinste Zahl im Array finden
            double min = Arrays.stream(array).min().getAsDouble();

            //größte Zahl im Array finden
            double max = Arrays.stream(array).max().getAsDouble();

            //Durchschnittswert des Arrays
            double durchschnitt = Arrays.stream(array).average().getAsDouble();

            //Anzahl der Werte über dem Durchschnittswert
            long anzahl = Arrays.stream(array).filter(x -> x > durchschnitt).count();

            //Anzahl der Werte unter dem Durchschnittswert
            long anzahl2 = Arrays.stream(array).filter(x -> x < durchschnitt).count();

            //Ausgabe
            System.out.println("Das Array: " + Arrays.toString(array));
            System.out.println("Die kleinste Zahl im Array ist: " + min);
            System.out.println("Die größte Zahl im Array ist: " + max);
            System.out.println("Der Durchschnittswert des Arrays ist: " + durchschnitt);
            System.out.println("Die Anzahl der Werte über dem Durchschnittswert ist: " + anzahl);
            System.out.println("Die Anzahl der Werte unter dem Durchschnittswert ist: " + anzahl2);
            // Fragt den Benutzer, ob er das Programm neustarten möchte
            int option2 = JOptionPane.showConfirmDialog(null, "Möchten sie das Programm neustarten?", "Neustarten?", JOptionPane.YES_NO_OPTION);
            if (option2 == JOptionPane.YES_OPTION) {
                neustart = true;
                System.out.println("Das Programm wird neu gestartet!");
                System.out.println("");
            } else {
                neustart = false;
            }
        }
        System.out.println("Programm beendet");
    }
}
