package bz.berufsschule.while_schleife;

import javax.swing.*;

/*
Erstelle ein Programm, das eine Dezimal in eine Binärzahl umwandelt. Zum Beispiel soll aus der
Dezimalzahl 8 die Binärzahl 100 werden.
Bevor das Programm beendet wird, soll der Benutzer gefragt werden ob er ds Programm wiederholen möchte
oder ob es beendet werden soll. möchte er ds Programm wiederholen, so startet es von vorne, andernfalls wird es beendet.
*/
public class beispiel4 {
    public static void main(String[] args) {
        String eingabe = JOptionPane.showInputDialog("Gib eine Dezimalzahl ein:");
        int zahl = Integer.parseInt(eingabe);

        String ergebnis = "";

        while (zahl > 0) {
            int rest = zahl % 2;
            ergebnis = rest + ergebnis;
            //zahl /=2 alternative schreibweise für zahl = zahl / 2;
            zahl = zahl / 2;
        }
        System.out.println(eingabe + " entspricht der Binärzahl " + ergebnis);
    }
}
