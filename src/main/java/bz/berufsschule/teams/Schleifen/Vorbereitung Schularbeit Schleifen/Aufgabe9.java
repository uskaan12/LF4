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
public class Aufgabe9 {
    
    /**
     * Nimm den Code von Aufgabe 2 und erweitere ihn so, dass der Benutzer entscheiden
     * kann ob das Programm beendet oder wiederholt werden soll
     */
    
    public static void main(String[] args) {
        
        boolean wiederholen = true;
        
        while(wiederholen){
            for(int i = 1; i <=100; i++){

                if(i%4 == 0){ //Mit dem Modulooperator wird überprüft ob der Rest 0 ist
                              //Wenn ja wird die Zahl ausgegeben
                    System.out.println(i);
                }
            }
            
            String eingabe = JOptionPane.showInputDialog("Möchten Sie das Programm wiederholen j/n");
            if(eingabe.equals("n")){
                wiederholen = false;
            }
        }
        
    }
    
}
