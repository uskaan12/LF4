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
public class punkte_f1 {

    public static void main(String[] args) {
        int plazierung;
        String eingabe = JOptionPane.showInputDialog("Bitte geben sie ihr eplatzierung ein:");
        plazierung = Integer.parseInt(eingabe);

        if (plazierung == 1) {
            System.out.println("Sie bekommen 25 Punkte!");
        } else if (plazierung == 2) {
            System.out.println("Sie bekommen 18 Punkte!");
        } else if (plazierung == 3) {
            System.out.println("Sie bekommen 15 Punkte!");
        } else if (plazierung == 4) {
            System.out.println("Sie bekommen 12 Punkte!");
        } else if (plazierung == 5) {
            System.out.println("Sie bekommen 10 Punkte!");
        } else if (plazierung == 6) {
            System.out.println("Sie bekommen 8 Punkte!");
        } else if (plazierung == 7) {
            System.out.println("Sie bekommen 6 Punkte!");
        } else if (plazierung == 8) {
            System.out.println("Sie bekommen 4 Punkte!");
        } else if (plazierung == 9) {
            System.out.println("Sie bekommen 2 Punkte!");
        } else if (plazierung == 10) {
            System.out.println("Sie bekommen 1 Punkt!");
        } else {
            System.out.println("Sie bekommen keine Punkte!");
        }
    }
}
