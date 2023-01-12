/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

/**
 *
 * @author Administrator
 */
public class Aufgabe10 {
    
    
    /*
    
    */
    
    public static void main(String[] args) {
        
        int z =0;
        int summe = 0;
        for(int i=1;i<=55;i++){
        
            if(i%2==0){
                System.out.print(i+" "); // Gerade Zahl wird in der Konsole ausgegeben
                z++; //Zähler für die ausgegeben Zahlen wird um 1 erhöht
                if(z==5){ //Wenn der zähler gleich 5 ist
                    System.out.println("");// dann wird eine neue Zeile gemacht
                    z=0; // und der Zähler auf 0 zurückgesetzt
                }
                summe = summe + i;
            }
        }
        System.out.println("\nDie Summe aller geraden Zahlen "
                + "zwischen 1 und 55 lautet: " + summe);
    }
}
