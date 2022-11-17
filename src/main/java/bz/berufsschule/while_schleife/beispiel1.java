package bz.berufsschule.while_schleife;

/*
Man kann jede for-Schleife als while-Schleife programmieren.
Schreibe die folgende for-Schleife als while-Schleife:
for (int i =1; i<=10; i=i+1) {
            System.out.println(i);
}
Diese Schleife wird 10-mal durchlaufen und gibt die Werte von 0 bis 9 aus
 */
public class beispiel1 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Nach der Schleife hat i den Wert " + i);
    }
}
