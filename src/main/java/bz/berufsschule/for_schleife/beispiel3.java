package bz.berufsschule.for_schleife;

import javax.swing.*;

public class beispiel3 {
    public static void main(String[] args) {
        /*
        Erstelle ein Programm das dem Nutzer das den Anfangswert und den Zielwert eingeben lässt.
        Dann soll er noch eingeben können, ob alle geraden oder ungeraden Zahlen in diesem Intervall ausgegeben werden sollen.
        Achtung: Zielwert muss größer sein als der Anfangswert, ansonsten soll eine Fehlermeldung ausgegeben werden.
         */
        String anfangswert = JOptionPane.showInputDialog("Bitte geben sie den Anfangswert an");
        String zielwertwert = JOptionPane.showInputDialog("Bitte geben sie den Zielwert an");
        String modus = JOptionPane.showInputDialog("Sollen die Zahlen gerade oder ungerade sein (G/U)");

        int anfang = Integer.parseInt(anfangswert);
        int ziel = Integer.parseInt(zielwertwert);
        if (anfang > ziel) {
            System.out.println("Der Zielwert ist kleiner oder gleich als der Anfangswert. Bitte geben sie die Werte erneut ein.");
        }
        else {
            if (modus.equals("U") && anfang%2==0 || modus.equals("G") && anfang%2!=0){
                anfang = anfang + 1;
            }
        }
        for (int i =anfang; i<=ziel; i+= 2) {
            System.out.println(i);
        }
    }
}