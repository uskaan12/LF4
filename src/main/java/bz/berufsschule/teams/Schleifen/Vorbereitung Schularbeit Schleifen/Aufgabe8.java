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
public class Aufgabe8 {
    
    /*
     * Erstelle ein Javaprogramm, das alle Zahlen die ein Benutzer eingibt addiert
     * Erstelle dafür eine Whileschleife, die solange ausgeführt wird, bis der
     * Benutzer keine Zahl mehr eingibt.
     * Abschließend soll das Ergebnis ausgegeben werden.
     */
    
    public static void main(String[] args) {
        
        
        int summe = 0;
        boolean weitereZahl = true;
        
        while(weitereZahl){
            
            String eingabe = JOptionPane.showInputDialog("Bitte geben Sie eine Zahl ein");
            if(!eingabe.equals("n")){ //wenn der Benutzer nicht n eingibt wird 
                                      //gerechnet, sonst wird die Schleife abgebrochen!
                int zahl = Integer.parseInt(eingabe);
                summe = summe + zahl;
            }else{
                weitereZahl = false;
            }
        }
        System.out.println("Das Ergebnis lautet: " + summe);
    }
}
