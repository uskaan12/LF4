/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Beispiel4 {

    /*
        Erstelle ein Programm, das eine Dezimalzahl in eine Binärzahl umwandelt. Zum Beispiel soll aus der 
        Dezimalzahl 8 die Binärzahl 1000 werden.
        Bevor das Programm beendet wird, soll der Benutzer gefragt werden ob er das Programm wiederholen möchte
        oder ob es beendet werden soll. Möchte er das Programm wiederholen, so startet es von vorne, 
        anderfalls wird es beendet.
     */
    public static void main(String[] args) {

        boolean wiederholen = true;
        while (wiederholen) {
            String eingabe = JOptionPane.showInputDialog("Bitte geben sie eine ganze Dezimalzahl ein!");
            int zahl = Integer.parseInt(eingabe);

            String ergebnis = "";

            while (zahl > 0) {

                int rest = zahl % 2;//Rest ausrechen
                ergebnis = rest + ergebnis;//Rest vonre ans Ergebnis schreiben
                //zahl /= 2; altenative Schreibweise für zahl = zahl / 2
                zahl = zahl / 2; //Zahl durch 2 dividieren
            }
            System.out.println(eingabe + " entspricht der Binärzahl " + ergebnis);
            
            String eingabe2 = JOptionPane.showInputDialog("Möchten Sie das Programm wiederholen? j/n");
            if(eingabe2.equalsIgnoreCase("n")){
                wiederholen = false;
            }
        }
    }
}
