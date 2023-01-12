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
public class Aufgabe12 {
    
    /*
        Aufgabe 16:
	Erstelle ein Tipspiel, wo der Benutzer eine Zahl zwischen 1 und 100 erraten
	muss. Er hat dabei 5 Versuche, wobei er nach jedem Versuch einen Hinweis
	bekommt, ob seine Schätzung unter oder über der gesuchten Zahl lag. Hat 
	er nach dem 5. Versuch die Zahl immer noch nicht erraten, dann hat er das Spiel
	verloren.
	Am Ende des Spiels soll der Benutzer gefragt werden, ob er nochmals spielen
	möchte oder ob das Programm beendet werden soll.
    
    */
    
    public static void main(String[] args) {
        
        boolean wiederholen = true;
        while (wiederholen) {
            
            Random zufall = new Random();
            int zahl = zufall.nextInt(100)+1; //Die zu erratende Zahl wird erzeugt
            
            int z = 0;
            while(z < 5){
                
                String eingabe = JOptionPane.showInputDialog("Take your guess!!!");
                int guess = Integer.parseInt(eingabe); // Der Benutzer gibt seinen Tip ab.
                
                if(guess == zahl){ // wenn er die Zahl erraten hat, wird die Schleife unterbrochen
                    
                    System.out.println("YOU WON!!!");
                    break; // damit die Schleife beendet wird
                }else{
                    System.out.println("WRONG!!!");
                    if(guess>zahl){
                        System.out.println("Your guess was too high!");
                    }else{
                        System.out.println("Your guess was too low!");
                    }
                    z++;
                    System.out.println("You have " + (5-z) + " guesses left!");
                }
                
                System.out.println("");
                System.out.println("");
            }
            if(z==5){ // wenn die Schleife beendet wurde und der Spieler 5 Fehlversuche hatte, dann hat er das Spiel verloren
                System.out.println("GAME OVER!");
                System.out.println("The number we were looking for was " + zahl+ "!");
                System.out.println("");
                System.out.println("");
            }

                // Hier wird der Benutzer gefragt ob er das Programm wiederholen möchten. Wenn er n eingibt
                //wird es beendet ansonsten wiederholt
                String eingabe1 = JOptionPane.showInputDialog("Möchten Sie das Programm wiederholen? j/n");
                if (eingabe1.equalsIgnoreCase("n")) {
                    wiederholen = false;
                }
            
    }
    }
}
