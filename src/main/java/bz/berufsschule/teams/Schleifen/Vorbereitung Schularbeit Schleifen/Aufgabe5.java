/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

/**
 *
 * @author Administrator
 */
public class Aufgabe5 {
    
    /*
        Gib alle naturlichen Zahlen zwischen 1 und 100 in einer Zeile aus, 
	   die durch 6 oder 8 teilbar sind.
	   Erweitere das Programm so, dass es nach jeweils 6 gedruckten Zahlen 
	   auf den Anfang der nächsten Zeile springt.
    */
    
    
    public static void main(String[] args) {
        
        int zaehler=0; //Damit zählen wir wie oft eine Zahl bereits ausgegeben wurde
        
        for(int i = 1; i <=100; i++){ //Schleife von 1 bis 100
            
            if(i%6 ==0 || i%8 ==0){//Die Zahl wird ausgegeben, wenn sie entweder durch 6 oder durch 8 teilbar ist 
                
                System.out.print(i + " ");
                zaehler++; // Jedes Mal wenn eine Zahl ausgegeben wird, wird der Zähler um 1 erhöht
                if(zaehler == 6){
                    System.out.println("");// Wurden schon 6 Zahlen ausgegeben, machen wir eine neue Zeile
                    zaehler = 0; // und setzen den Zähler zurück auf 0  
                } 
            }                    
        }
    }
    
}
