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
public class AltersUeberPruefung {
    
    
    public static void main(String[] args) {
        
        int alter;
        
        String eingabe = JOptionPane.showInputDialog
        ("Bitte geben Sie ihr Alter ein");
        
        alter = Integer.parseInt(eingabe);
        
        if(alter < 18){
            System.out.println("Sie sind minderjährig");
            //Der Code der ausgeführt wird, wenn die Bedinung 
            //wahr ist
        }else{
            System.out.println("Sie sind volljährig");
            //Der Code der ausgeführt wird, wenn die Bedinung 
            //falsch ist
        }
    }
    
    
}
