package bz.berufsschule.arrays.eindimensionale_arrrays;

import javax.swing.*;

/*
    1. Erstelle ein Array der Länge 100 mit Zufallszahlen zwischen 1 und 1000.
       Anschließend soll überprüft werden, ob und wie oft die Zahl 555 im Array drinnen ist. Ist die Zahl 555 nicht im Array enthalten, soll das entsprechend Ausgegeben werden.
    2. Ändere das programm so ab, dass der Benutzer die Zahl, die gesucht werden soll, eingeben kann.

    3. Erweiter das Programm so, dass der Benutzer nach mehreren Zahlen suchen kann.

    4. Erweiter das Programm so, dass der Benutzer entscheiden kann, ob das Program wiederholt oder beendet werden soll.
 */
public class bsp5 {
    public static void main(String[] args) {
        boolean neustart = true;
        while (neustart) {
            // Erstelle ein Integer-Array der Länge 100
            int[] array = new int[100];
            // Fülle es mit Zufallszahlen zwischen 1 und 1000
            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 1000) + 1;
            }
            boolean wiederholen_andere_Zahl = true;
            while (wiederholen_andere_Zahl) {
                // Überprüft, ob und wie oft die von Benutzer gegebene Zahl im Array drinnen ist
                String eingabe1 = JOptionPane.showInputDialog("Geben sie die zu Suchende Zahl ein");
                int zahl1 = Integer.parseInt(eingabe1);
                int counter1 = 0;
                for (int num : array) {
                    if (num == zahl1) {
                        counter1++;
                    }
                }
                // Gibt das Ergebnis in der Konsole aus
                if (counter1 == 0) {
                    System.out.println("Die Zahl " + zahl1 + " ist nicht im Array enthalten");
                } else {
                    System.out.println("Die Zahl " + zahl1 + " ist " + counter1 + " mal im Array enthalten.");
                }
                // Fragt den Benutzer, ob er eine andere Zahl suchen möchte
                int option = JOptionPane.showConfirmDialog(null, "Möchten sie eine andere Zahl suchen?", "Andere Zahl?", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    wiederholen_andere_Zahl = true;
                } else {
                    wiederholen_andere_Zahl = false;
                }
            }
            // Fragt den Benutzer, ob er das Programm neustarten möchte
            int option2 = JOptionPane.showConfirmDialog(null, "Möchten sie das Programm neustarten?", "Neustarten?", JOptionPane.YES_NO_OPTION);
            if (option2 == JOptionPane.YES_OPTION) {
                neustart = true;
            } else {
                neustart = false;
            }
        }
        System.out.println("Programm beendet");
    }
}
