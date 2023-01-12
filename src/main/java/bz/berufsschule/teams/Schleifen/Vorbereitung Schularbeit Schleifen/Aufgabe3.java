/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

/**
 *
 * @author Administrator
 */
public class Aufgabe3 {
    
    /**
     * Gib alle naturlichen Zahlen zwischen 1 und 200 aus, die durch 
           3 und 16 teilbar sind. 
     */
    
    public static void main(String[] args) {
        
        for(int i = 1; i <=200; i++){ //Schleife von 1 bis 200
            
            if(i%3 ==0 && i%16 ==0){ 
                //Die Zahl wird nur ausgegeben, wenn beide Bedingungen wahr sind
                //d.h. die Zahl muss sowohl durch 3 als auch durch 16 teilbar sein
                System.out.println(i);
            }
        }
    }
}
