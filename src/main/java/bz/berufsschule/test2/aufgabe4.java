package bz.berufsschule.test2;

import javax.swing.*;

public class aufgabe4 {
    public static void main(String[] args) {
        for (int i=1; i<=5; i++){
            String username = JOptionPane.showInputDialog("Bitte geben sie ihren Benutzernamen ein:");
            String password = JOptionPane.showInputDialog("Bitte geben sie ihr Kennwort ein:");
            if (username.equals("user1") && password.equals("Kennwort0")){
                System.out.println("Login erfolgreich!");
                break;
            } else if (i ==4 ) {
                System.out.println("Benutzername oder Kennwort falsch!");
                System.out.println("Warnung: Du hast nur noch einen Versuch übrig!");
            } else if (i==5){
                System.out.println("Benutzername oder Kennwort falsch!");
                System.out.println("Dies war dein 5. Fehlversuch! Das Konto wurde gesperrt! Bitte wenden Sie sich an ihren Administrator");
            } else {
                System.out.println("Benutzername oder Kennwort falsch!");
            }
        }
    }
}
