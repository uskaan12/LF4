/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe7 {
    
    
    /**
     * Erstelle ein Javaprogramm, das ein Würfelspiel mit 2 Würfeln simuliert. Am Spiel nehmen zwei Spieler teil, die
       abwechslend würfeln. Folgende Regeln sollen in das Spiel eingebaut werden:
       Wenn ein Spieler 2 sechsen würfelt, darf er nochmals würfeln
       Gewonnen hat jener Spieler der zuerst von 501 auf 0 kommt.
       Jeder Spieler hat einen Namen
       Nach jeder Runde würfeln soll der aktuelle Spielstand ausgegeben werden
       Das Spiel endet erst wenn der Spieler genau 0 erreicht. Ist seine Augenzahl beim letzten wurf zu groß, wird
       der Wurf ignoriert. Dies gilt auch für den Fall, dass der Spieler auf 1 runtergehen würde
      
       Am Ende des Spieles soll der Benutzer gefragt werden, ob er das Programm nochmals auführen möchte oder
        ob es beendet werden soll.
     */
    
    public static void main(String[] args) {
        
        String name_spieler1 = JOptionPane.showInputDialog("Spieler 1 geben Sie ihren Namen ein!");
        String name_spieler2 = JOptionPane.showInputDialog("Spieler 2 geben Sie ihren Namen ein!");
        
        Random zufall = new Random();
        
        boolean ist_Spieler1_dran = true;
        
        int punkte_spieler1 = 501;
        int punkte_spieler2 = 501;
        
        // Die Schleife soll so lange ausgeführt werden bis die Punkte eines Spielers auf
        // 0 gesetzt werden
        while(punkte_spieler1 > 0 && punkte_spieler2 > 0){
        
            int zahl1 = zufall.nextInt(6)+1;//Würfel NR. 1
            int zahl2 = zufall.nextInt(6)+1;//Würfel NR. 2
            
            if(ist_Spieler1_dran){ // wir überprüfen ob Spieler 1 an der Reihe ist
            
                //Hier überprüfen wir, ob der Spieler mit der gewürfelten Zahl unter 0 oder auf
                //1 kommt, wenn ja ist der Wurf ungültig, wenn nein werden die Punkte subtrahiert
                if(punkte_spieler1 - zahl1 -zahl2 >= 0 && punkte_spieler1 -zahl1 -zahl2 != 1){
                    punkte_spieler1 = punkte_spieler1 - zahl1 - zahl2;
                    System.out.println(name_spieler1 + " hat " + (zahl1+zahl2) + " gewürfelt!");
                    System.out.println(name_spieler1 + " hat " + punkte_spieler1 + " Punkte");
                }else{
                    System.out.println(name_spieler1 + " ungültiger Versuch!");
                }
                //Hier überprüfen wir ob der Spieler zwei 6er gewürfelt hat
                //Wenn ja ist er nochmals an der Reihe, wenn nicht kommt Spieler2 dran
                if(zahl1==6 && zahl2==6){
                    System.out.println(name_spieler1 + " darf nochmals würfeln!");
                }else{
                    ist_Spieler1_dran = false; //bedeutet Spieler 2 ist dran
                }
            }else{
            
                //Hier überprüfen wir, ob der Spieler mit der gewürfelten Zahl unter 0 oder auf
                //1 kommt, wenn ja ist der Wurf ungültig, wenn nein werden die Punkte subtrahiert
                if(punkte_spieler2 - zahl1 -zahl2 >= 0 && punkte_spieler2 -zahl1 -zahl2 != 1){
                    punkte_spieler2= punkte_spieler2 - zahl1 - zahl2;
                    System.out.println(name_spieler2 + " hat " + (zahl1+zahl2) + " gewürfelt!");
                    System.out.println(name_spieler2 + " hat " + punkte_spieler2 + " Punkte");
                }else{
                    System.out.println(name_spieler2 + " ungültiger Versuch!");
                }
                //Hier überprüfen wir ob der Spieler zwei 6er gewürfelt hat
                //Wenn ja ist er nochmals an der Reihe, wenn nicht kommt Spieler2 dran
                if(zahl1==6 && zahl2==6){
                    System.out.println(name_spieler2 + " darf nochmals würfeln!");
                }else{
                    ist_Spieler1_dran = true; //bedeutet Spieler 1 ist dran
                }
            }
            
            System.out.println("");
            System.out.println("");
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Aufgabe7.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(punkte_spieler1 == 0){
            System.out.println(name_spieler1 + " hat gewonnen!");
        }else{
            System.out.println(name_spieler2 + " hat gewonnen!");
        }
    }
}
