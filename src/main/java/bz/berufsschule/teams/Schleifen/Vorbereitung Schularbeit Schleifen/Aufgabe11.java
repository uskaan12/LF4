/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe11 {
    
    /*
        Aufgabe 2:
	Erstelle ein Programm, das aus 5 zufällig erzeugten Zahlen, jeweils die
	Summe und den Durchschnitt dieser Zahlen berechnet und in der Konsole ausgibt.
	Das Programm soll nicht automatisch beendet werden, sondern der Benutzer
	soll entscheiden können, ob er es nochmals ausführen möchte.
     */
    public static void main(String[] args) {

        boolean wiederholen = true;
        while (wiederholen) {
            int summe = 0;
            Random zufall = new Random();
            for (int i = 0; i < 5; i++) { //Wir brauchen 5 Zufallszahlen, also eine Schleife die 5 Mal durchlaufen wird

                int zahl = zufall.nextInt(100) + 1;
                summe = summe + zahl;
                System.out.print(zahl + " ");

            }

            double durchschnitt = summe / 5.0;
            System.out.println("Die Summe der fünf Zahlen lautet: " + summe);
            System.out.println("Der Durchschnitt der fünf Zahlen lautet: " + durchschnitt);

           
            // Hier wird der Benutzer gefragt ob er das Programm wiederholen möchten. Wenn er n eingibt
            //wird es beendet ansonsten wiederholt
            String eingabe = JOptionPane.showInputDialog("Möchten Sie das Programm wiederholen? j/n");
            if (eingabe.equalsIgnoreCase("n")) {
                wiederholen = false;
            }
        }
    }
}
