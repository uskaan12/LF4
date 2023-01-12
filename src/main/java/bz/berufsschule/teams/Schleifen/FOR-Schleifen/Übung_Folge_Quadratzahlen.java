/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.whileschleifen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Übung_Folge_Quadratzahlen {
    
    /*
        Übung 1
        Erstelle ein Programm, das die Folge der Quadratzahlen bis zu einer vom Benutzer 
        eingegeben Obergrenze in der Konsole ausgibt. Die Zahlen sollen dabei durch einen 
        Beistrich und einem Leerzeichen getrennt werden. Nach der letzten Zahl soll kein Beistrich mehr
        sein!
    
        Übung 2
        Abstandsfolge ---> Dabei wird der Abstand immer um 1 größer zb 1,2,4,7,11,16,22,29,37,....
    
        Übung 3
        Fibonaccifolge --> 1,1,2,3,5,8,13,21,34,....
    */
    public static void main(String[] args) {
        
        int z = 1;
        String eingabe = JOptionPane.showInputDialog("Bitte geben Sie die Obergrenze ein!");
        int grenze = Integer.parseInt(eingabe);
        boolean wiederholen = true;
        
        while(wiederholen){
        
            if(z*z > grenze){
                wiederholen = false;
            }else{
                if(z==1){
                    System.out.print(z*z);
                }else{
                    System.out.println(", " +z*z);
                }
            }
            z++;
        }
    }
}
