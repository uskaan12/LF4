/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.forschleifen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Beispiel3 {
    
    /*
        Erstelle ein Programm, dass den Benutzer den Anfangswert und den Zielwert
        eingeben lässt. Dann soll er noch eingeben können ob alle geraden oder 
        alle ungeraden Zahlen in diesem Intervall ausgegeben werden sollen.
        Achtung: Zielwert muss größer sein als der Anfangswert, ansonsten soll eine
                 Fehlermeldung ausgegeben werden
    
    Anfangswert: 1. ungerade und der Anfangswert ist ungerade --> so lassen
                 2. gerade und der Anfangswert ist gerade --> so lassen
                 3. ungerade und Anfangswert ist gerade ---> anfangswert +1
                 4. gerade und Anfangswert ist ungerade ---> anfangswert +1
    
    
    Endwert: Benutzereingabe
    Schrittweite: 1
    
    
        Weiter Aufgaben: 3.3, 3.4 und 3.5 aus dem Übungskatalog
    */
    
    public static void main(String[] args) {
        
       String anfang = JOptionPane.showInputDialog("Geben Sie den Anfangswert ein!");
       String zielwert_String = JOptionPane.showInputDialog("Geben Sie den Zielwert ein!");
       String modus = JOptionPane.showInputDialog("Möchten sie alle geraden oder alle ungeraden Zahlen ausgeben?");
       
       int anfangswert = Integer.parseInt(anfang);
       int zielwert = Integer.parseInt(zielwert_String);
       
       if(anfangswert > zielwert){
           System.out.println("Fehler! Der Anfangswert darf nicht größer sein als der Zielwert!");
       }else{
       
           if((modus.equals("ungerade") && anfangswert%2==0) || 
                   (modus.equals("gerade") && anfangswert%2 != 0)){
               anfangswert = anfangswert + 1; // anfangswert++ oder anfangswert +=1
           }
       }
       
       for(int i = anfangswert;i<=zielwert;i=i+2){
           System.out.println(i);
       }
    }
    
}
