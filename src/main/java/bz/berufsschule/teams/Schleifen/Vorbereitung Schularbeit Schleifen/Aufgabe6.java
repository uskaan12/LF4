/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe6 {
    
    
    /**
     *  Schreibe ein Programm, das alle Primzahlen bis zu einer vom Benutzer festgelegten Grenze ausgibt
     */
    
    public static void main(String[] args) {
        
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie die Obergrenze ein!");
        int grenze = Integer.parseInt(eingabe);
        
        for(int i=1;i<=grenze;i++){//Die Forschleife wird solange ausgeführt bis die vom 
                                   //Benutzer eingegeben Zahl erreicht wird 
        
            boolean istPrimzahl = true;
            for(int j = 2; j<=i/2;j++){ //Mit dieser For-schleifen testen wir ob eine Zahl
                                       //existiert die durch die der aktuell Wert von i teilbar ist
                if(i%j == 0){
                    istPrimzahl = false; // Wenn i durch j teilbar ist, ist i keine Primzahl
                }
            }
            if(istPrimzahl){            // Wenn i eine Primzahl ist wird sie ausgegeben
                System.out.println(i);
            }
        }
    }
}
