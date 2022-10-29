package bz.berufsschule.verzweigungen_INF2A;

import javax.swing.*;

public class einkommensteuer_2_28 {
    public static void main(String[] args) {
        String eingabe1 = JOptionPane.showInputDialog("Bitte geben sie ihren Einkommen ein:");
        double einkommen = Double.parseDouble(eingabe1);
        if (einkommen > 5000) {
            double steuer;
            steuer = (einkommen - 5000) * 0.20;
            System.out.println("Du musst "+steuer + " in Steuern zahlen.");
        }
        else {
            System.out.println("Dein Einkommen ist zu gering, du musst keine Steuern zahlen." );
        }
    }
}
