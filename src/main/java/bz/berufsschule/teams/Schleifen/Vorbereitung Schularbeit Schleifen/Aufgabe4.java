/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vorbereitung2SA;

/**
 *
 * @author Administrator
 */
public class Aufgabe4 {
    /**
     * Schreibe ein Programm, dass alle Schaltjahre zwischen 1900 
	   und 2100 (jeweils einschließlich) ausgibt. 
           Schaltjahre lassen sich durch vier dividieren. 
	   Ein Jahr ist aber kein Schaltjahr, wenn es sich durch 100 teilen lässt.
	   Ausgenommen davon sind alle Jahre, die sichaber durch 400 teilen lassen.
     */
    
    public static void main(String[] args) {
        
        
        for(int i = 1900; i<=2100;i++){
            
            if(i%4==0 && i%100 != 0){
                //Wenn die Zahl durch 4 teilbar ist und nicht durch 100
                //dann ist es ein Schaltjahr
                System.out.println(i);
            }else if(i%400 == 0){
                System.out.println(i);
            }
        
        }
    }
}
