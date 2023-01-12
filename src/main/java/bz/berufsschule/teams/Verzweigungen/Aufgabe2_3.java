/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.verzweigungen;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class Aufgabe2_3 {
    
    public static void main(String[] args) {
        
        int note;
        
        String eingabe = JOptionPane.showInputDialog("Geben Sie die Note ein!");
        note = Integer.parseInt(eingabe);
        
        
        if(note == 4){
            System.out.println("vollkommen ungenügend");
        }else if( note == 5){
            System.out.println("ungenügend");
        }else if( note == 6){
            System.out.println("genügend");
        }else if( note == 7){
            System.out.println("zufriedenstellend");
        }else if( note == 8){
            System.out.println("gut");
        }else if( note == 9){
            System.out.println("sehr gut");
        }else if( note == 10){
            System.out.println("ausgezeichnet");
        }else{
            System.out.println("Es können nur Noten zwischen 4 und 10 eingegeben werden");
        }
    }
}
