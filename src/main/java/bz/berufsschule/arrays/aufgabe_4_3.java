package bz.berufsschule.arrays;

import javax.swing.*;
import java.util.Random;

/*
        Erstelle eine Array mit benutzerdefinierte Größe und fülle es mit Zahlen
        zwischen 18 und 67
        Suche nach der größten und kleinsten Zahl im Array und gib deren Position aus
        Berechne zusätzlich den Durchschnitt aller Zahlen im Array

        Zusatz: Verändere das Programm so, dass der Benutzer das Intervall für die
        Zufallszalen eingeben kann.
*/
public class aufgabe_4_3 {
    public static void main(String[] args) {

        //Benutzereingabe für die Länge des Arrays
        String eingabe = JOptionPane.showInputDialog("Wie groß soll das Array sein?");
        int groesse = Integer.parseInt(eingabe);

        //Erstellen des Arrays
        int[] array = new int[groesse];

        //Fülle das Array mit Zufallszahlen zwischen 18 und 67
        Random zufall = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = zufall.nextInt(50)+18; // (max - min +1)+ min

        }

        //Suche nach der größten bzw kleinsten Zahl und Berechnung des Durchschnitts
        int kleinste_zahl = Integer.MAX_VALUE;
        int groesste_zahl = Integer.MIN_VALUE;
        int stelle_kleinste_zahl = -1;
        int stelle_groesste_zahl = -1;
        int summe = 0;

        for (int i = 0; i < array.length; i++) {
            summe = summe + array[i];
            if(array[i]<kleinste_zahl){
                kleinste_zahl = array[i];
                stelle_kleinste_zahl = i;
            }
            if(array[i]>groesste_zahl){
                groesste_zahl = array[i];
                stelle_groesste_zahl = i;
            }
        }

        int durchschnitt = summe / array.length;

        //Ausgabe to do!!!
    }
}
