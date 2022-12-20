/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.verzweigungen;

import javax.swing.JOptionPane;

/**
 *
 * @author INF2A_senoner_johann
 */
public class teilerprobe_2_7 {
    public static void main(String[] args) {
        
        double a;
        double b;
        String eingabe1 = JOptionPane.showInputDialog("bitte geben sie den Wert von a (Divident) ein.");
        a = Double.parseDouble(eingabe1);
        String eingabe2 = JOptionPane.showInputDialog("bitte geben sie den Wert vom Teiler b ein");
        b = Double.parseDouble(eingabe2);
        
        if (a%b == 0){
            System.out.println("b ist ein Teiler von a.");
        }else {
            System.out.println("b ist kein Teiler von a.");
        }
    }
    
}

