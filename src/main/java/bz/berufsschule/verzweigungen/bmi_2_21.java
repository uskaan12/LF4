package bz.berufsschule.verzweigungen;

import javax.swing.*;

public class bmi_2_21 {
    public static void main(String[] args) {

        double weight;
        double height;
        double bmi;
        String eingabe1 = JOptionPane.showInputDialog("Bitte geben sie Ihr Gewicht ein");
        String eingabe2 = JOptionPane.showInputDialog("Bitte geben sie Ihre Größe ein (in m)");
        String gender = JOptionPane.showInputDialog("Bitte geben sie Ihr geschlecht ein(m oder f)");

        weight = Double.parseDouble(eingabe1);
        height = Double.parseDouble(eingabe2);
        bmi = weight / (height * height);

        if (gender.equalsIgnoreCase("m")){
            if (bmi < 20){
                System.out.println("Sie sind in untergewicht mit einen BMI von " + bmi);
            }else if (bmi >= 20 && bmi < 25){
                System.out.println("Sie sind in normalgewicht mit einen BMI von " + bmi);
            }else if (bmi >= 25 && bmi < 30){
                System.out.println("Sie sind in leichtes übergewicht mit einen BMI von " + bmi);
            }else if (bmi >= 30 && bmi <= 40){
                System.out.println("Sie sind in mässiges übergewicht mit einer BMI von " + bmi);
            }else if (bmi > 40){
                System.out.println("Sie sind in starkes Übergewicht mit einer BMI von " + bmi + ". Sie haben eine Fettsucht (Adipositas)");
            }
        }
        if (gender.equalsIgnoreCase("f")){
            if (bmi < 19){
                System.out.println("Sie sind in untergewicht mit einen BMI von " + bmi);
            }else if (bmi >= 19 && bmi < 24){
                System.out.println("Sie sind in normalgewicht mit einen BMI von " + bmi);
            }else if (bmi >= 24 && bmi < 30){
                System.out.println("Sie sind in leichtes übergewicht mit einen BMI von " + bmi);
            }else if (bmi >= 30 && bmi <= 40){
                System.out.println("Sie sind in mässiges übergewicht mit einer BMI von " + bmi);
            }else if (bmi > 40){
                System.out.println("Sie sind in starkes Übergewicht mit einer BMI von " + bmi + ". Sie haben eine Fettsucht (Adipositas)");
            }
        }
    }
}
