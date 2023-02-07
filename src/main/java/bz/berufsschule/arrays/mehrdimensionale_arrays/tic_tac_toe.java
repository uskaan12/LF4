package bz.berufsschule.arrays.mehrdimensionale_arrays;
// Tic Tac Toe mit 2D-Array das ein 3x3 Feld darstellt uns 2 Spieler (X und O) die abwechselnd ihre Symbole eintragen können
public class tic_tac_toe {
    public static void main(String[] args) {

        // erzeuge spielfeld als 3x3 char-Array und fülle es mit Leerzeichen
        char[][] spielfeld = new char[3][3];
        for (int i = 0; i < spielfeld.length; i++) {
            for (int j = 0; j < spielfeld[i].length; j++) {
                spielfeld[i][j] = ' ';
            }
        }

        // While Schleife die, solange läuft bis ein Spieler gewonnen hat
        boolean gewonnen = false;
        while (!gewonnen) {
            // Spieler 1 ist dran
            // Eingabe abfragen
            // X und O im Spieldfeld eintragen
            // spielfeld ausgeben
            // prüfen ob jemand gewonnen hat
            // Spieler 2 ist dran
            // Eingabe abfragen
            // X und O im Spieldfeld eintragen
            // spielfeld ausgeben
            // prüfen ob jemand gewonnen hat
        }
        // zwei Spieler die abwechselnd dran sind

        // Eingabe abfragen

        // X und O im Spieldfeld eintragen

        // spielfeld ausgeben

        // prüfen ob jemand gewonnen hat
    }
}
