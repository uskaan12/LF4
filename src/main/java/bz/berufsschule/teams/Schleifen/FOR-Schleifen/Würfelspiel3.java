/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forschleifen;

import com.mycompany.verzweigungen_inf2a.ZufallsZahlen;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Würfelspiel3 {
    
    /*
        Zwei Spieler würfeln gegeneinander. Jeder hat 50 Versuche und der Spieler
        der am Ende mehr Punkte erreicht hat, hat gewonnen. Wenn beide Spieler 
        gleich viele Punkte haben, endet das Spiel unentschieden.
        Nach jeder Runde soll der Spielstand in der Konsole ausgegeben werden. Dafür 
        verwenden wir eine einfache grafische Balkendarstellung.
    */
    
    public static void main(String[] args) {
        
        String name_spieler1 = JOptionPane.showInputDialog("Spieler1 gib deinen Namen ein!");
        String name_spieler2 = JOptionPane.showInputDialog("Spieler2 gib deinen Namen ein!");
        
        if(name_spieler1.length() > name_spieler2.length()){ 
            int differenz = name_spieler1.length() - name_spieler2.length();
            for(int i = 1;i<=differenz;i++){
                name_spieler2 += " ";
            }
        }else{
            int differenz = name_spieler2.length() - name_spieler1.length();
            for(int i = 1;i<=differenz;i++){
                name_spieler1 += " ";
            }
        }
        
        int summe_spieler1=0;
        int summe_spieler2=0;
        
        String balken_spieler1="";
        String balken_spieler2="";
        
        Random zufall = new Random();
        
        for(int i=1;i<=50;i++){
        
            int zufallszahl_spieler1 = zufall.nextInt(6)+1;
            summe_spieler1 += zufallszahl_spieler1;
            for(int j=1;j<=zufallszahl_spieler1;j++){
                balken_spieler1 += "#";
            }
            
            int zufallszahl_spieler2 = zufall.nextInt(6)+1;
            summe_spieler2 += zufallszahl_spieler2;
            for(int j=1;j<=zufallszahl_spieler2;j++){
                balken_spieler2 += "#";
            }
            
            System.out.println("SPIELSTAND");
            System.out.println(name_spieler1 + ": " + balken_spieler1);
            System.out.println(name_spieler2 + ": " + balken_spieler2);
            System.out.println("");
            System.out.println("");
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(Würfelspiel3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        System.out.println(name_spieler1 + " hat " + summe_spieler1 + " Punkte erreicht");
        System.out.println(name_spieler2 + " hat " + summe_spieler2 + " Punkte erreicht");
        
        if(summe_spieler1 > summe_spieler2){
            System.out.println(name_spieler1 + " hat gewonnen!");
        }else if(summe_spieler2 > summe_spieler1){
             System.out.println(name_spieler2 + " hat gewonnen!");
        }else{
            System.out.println("Das Spiel endet unentschieden!");
        }
    }
}
