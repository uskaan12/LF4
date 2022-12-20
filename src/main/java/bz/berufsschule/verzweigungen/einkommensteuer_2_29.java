package bz.berufsschule.verzweigungen;

import javax.swing.*;

public class einkommensteuer_2_29 {
    public static void main(String[] args) {
        double steuer;
        double steuer_rounded;
        String eingabe1 = JOptionPane.showInputDialog("Bitte geben sie ihren Einkommen ein:");
        double einkommen = Double.parseDouble(eingabe1);
        if (einkommen < 10329.14) {
            steuer = einkommen * 0.18;
            steuer_rounded = Math.round(steuer * 100.0) / 100.0;
            System.out.println("Du musst "+steuer_rounded + " in Steuern zahlen.");
        }
    }
}
