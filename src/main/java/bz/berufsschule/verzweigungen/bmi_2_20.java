package bz.berufsschule.verzweigungen;

import javax.swing.*;

public class bmi_2_20 {
    public static void main(String[] args) {
        double groesse;
        double gewicht;
        double bmi;
        String eingabe1 = JOptionPane.showInputDialog("Bitte geben sie ihre Größe in meter ein:");
        groesse = Double.parseDouble(eingabe1);
        String eingabe2 = JOptionPane.showInputDialog("Bitte geben sie ihren Gewicht in kg an:");
        gewicht = Double.parseDouble(eingabe2);
        bmi = gewicht/(groesse*groesse);
        System.out.println("Ihr BMI ist " + bmi);
        if (bmi < 18) {
            System.out.println("Sie sind untergewichtig. :(");
        } else if (bmi >=18 && bmi <25) {
            System.out.println("Sie sind normalgewichtig. :)");
        } else if (bmi >=25 && bmi <27) {
            System.out.println("Sie sind leicht übergewichtig. :/");
        } else if (bmi >=27 && bmi <30) {
            System.out.println("Sie sind übergewichtig. :(");
        }
        else {
            System.out.println("Sie sind stark übergewichtig. :((((((((((");
        }
    }
}
