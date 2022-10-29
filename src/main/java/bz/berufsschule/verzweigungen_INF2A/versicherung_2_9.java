/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.verzweigungen_INF2A;

import javax.swing.JOptionPane;

/**
 *
 * @author INF2A_senoner_johann
 */
public class  versicherung_2_9{
    
    public static void main(String[] args) {
        
        double schadenp;
        double zahlen;
        double vers;
        double zahl1;
        double zahl2 = 100;
        String eingabe = JOptionPane.showInputDialog("Bitte geben sie den Preis des Schaden an");
        schadenp = Integer.parseInt(eingabe);
        
        if(schadenp > 100){
            zahlen = schadenp * 0.2;
            vers = schadenp - zahlen;
            if (zahlen < 100){
                zahl1 = zahl2 - zahlen;
                zahlen = zahlen + zahl1;
                vers = vers - zahl1;
            }
            System.out.println("Die versicherung zahlt: " + vers + " €" + " und sie müssen " + zahlen + " € zahlen");
        }else{
            System.out.println("Sie bekommen nichts gezahlt von der Versicherung und müssen die " + schadenp + " € zahlen");
        }
    }
}
