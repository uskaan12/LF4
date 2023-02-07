package bz.berufsschule.arrays.mehrdimensionale_arrays;
/*
    * Erstelle ein 3x3 Bingo Array mit Zahlen von 10 bis 40
    * Jede Runde wird eine neue Zahl gezogen und überprüft ob sie im Array vorhanden ist
    * sobald der Spieler drei Zahlen in der Horizontale oder in der Vertikalen oder in der Diagonale hat, hat er gewonnen(BINGO!)
    * Der Spieler wird am ende gefragt ob er nochmal spielen möchte oder nicht
 */
public class bingo_einfach {
    public static void main(String[] args) {
        int[][] spielfeld = new int[3][3];
        //fills array with random numbers from 10 to 40
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = (int) (Math.random() * 31) + 10;
            }
        }
        //prints array
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print(spielfeld[i][j] + " ");
            }
            System.out.println();
        }
        int versuche = 0;
        boolean bingo = false;
        while (!bingo){
            int zufallszahl = (int) (Math.random() * 31) + 10;
            System.out.println("Zufallszahl: " + zufallszahl);
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    if (spielfeld[i][j] == zufallszahl){
                        spielfeld[i][j] = 0;
                    }
                }
            }
            //prints array
            for (int i = 0; i < spielfeld.length; i++) {
                for (int j = 0; j < spielfeld[i].length; j++) {
                    System.out.print(spielfeld[i][j] + " ");
                }
                System.out.println();
            }
            versuche++;
            //check if bingo
            if (spielfeld[0][0] == 0 && spielfeld[0][1] == 0 && spielfeld[0][2] == 0){
                bingo = true;
            }
            if (spielfeld[1][0] == 0 && spielfeld[1][1] == 0 && spielfeld[1][2] == 0){
                bingo = true;
            }
            if (spielfeld[2][0] == 0 && spielfeld[2][1] == 0 && spielfeld[2][2] == 0){
                bingo = true;
            }
            if (spielfeld[0][0] == 0 && spielfeld[1][0] == 0 && spielfeld[2][0] == 0){
                bingo = true;
            }
            if (spielfeld[0][1] == 0 && spielfeld[1][1] == 0 && spielfeld[2][1] == 0){
                bingo = true;
            }
            if (spielfeld[0][2] == 0 && spielfeld[1][2] == 0 && spielfeld[2][2] == 0){
                bingo = true;
            }
            if (spielfeld[0][0] == 0 && spielfeld[1][1] == 0 && spielfeld[2][2] == 0){
                bingo = true;
            }
            if (spielfeld[0][2] == 0 && spielfeld[1][1] == 0 && spielfeld[2][0] == 0){
                bingo = true;
            }









        }


    }
}
