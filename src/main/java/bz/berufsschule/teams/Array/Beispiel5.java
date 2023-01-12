/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bz.berufsschule.teams.Array;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Manfred Gerstgrasser
 * 
 *      1. Erstelle ein Array der Länge 100 mit Zufallszahle zwischen 1- 1000.
 *         Anschließend soll überprüft werden ob und wie oft die 555 
 *         im Array drinnen ist. Ist 555 nicht im Array soll das entsprechend
 *         ausgegeben werden
 * 
 *     2. Ändere das Programm so ab, dass der Benutzer die Zahl, die gesucht
 *        werden soll, eingeben kann.
 * 
 *     3. Erweiter das Programm so, dass der Benutzer nach mehreren Zahlen
 *        im selben Array suchen kann.
 * 
 *     4. Erweiter das Programm so, dass der Benutzer entscheiden kann, ob das 
 *        Programm wiederholt oder beendet werden soll. Will er das Programm wiederholen
 *        wird ein neues Array mit neuen Zahlen generiert.
 *      
 * 
 */
public class Beispiel5 {
    
    
    public static void main(String[] args) {
        
        boolean programm_wiederholen = true;
        while(programm_wiederholen){
            //Erstellen eines Arrays mit Länge 100
            int[] array = new int[100];

            //Füllen des Arrays mit Zahlen zwischen 1-1000
            Random zufall = new Random();
            for(int i=0;i<array.length;i++){
                array[i] = zufall.nextInt(1000)+1;
            }

            boolean wiederholen = true;
            while(wiederholen){
                String eingabe = JOptionPane.showInputDialog("Bitte geben Sie die zu suchende Zahl ein");
                int zahl = Integer.parseInt(eingabe);

                //Suche nach der vom Benutzer eingegeben Zahl
                int zähler = 0;
                boolean gefunden = false;
                for(int i=0;i<array.length;i++){
                    if(array[i] == zahl){
                        zähler++;
                        System.out.println(zahl +" befindet sich an der Stelle " + i);
                        gefunden = true;
                    }
                }
                if(!gefunden){
                    System.out.println(zahl +" wurde nicht gefunden!");
                }

                //der ConfirmDialog erzeugt ein PopUP, das dem Benutzer erlaubt
                //auf ja oder nein zu klicken. Ja gibt 0 zurück und Nein gibt 1 zurück
                int weiter = JOptionPane.showConfirmDialog(null, "Möchten Sie noch eine Zahl suchen?");
                System.out.println(weiter);
                if(weiter == 1){
                    wiederholen = false;
                }
            }
            
            int programm_weiter = JOptionPane.showConfirmDialog(null, "Möchten Sie das Programm wiederholen?");
            if(programm_weiter == 1){
                programm_wiederholen = false;
            }
        }
    }
}
