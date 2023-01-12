/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

/**
 *
 * @author Administrator
 */
public class Aufgabe2 {
    
    /**
     * Gib alle naturlichen Zahlen zwischen 1 und 100 aus, die durch  4 teilbar sind. 
     */
    
    public static void main(String[] args) {
        
        for(int i = 1; i <=100; i++){
            
            if(i%4 == 0){ //Mit dem Modulooperator wird überprüft ob der Rest 0 ist
                          //Wenn ja wird die Zahl ausgegeben
                System.out.println(i);
            }
        }
    }
}
