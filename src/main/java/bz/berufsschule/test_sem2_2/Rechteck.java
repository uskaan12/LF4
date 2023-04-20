package bz.berufsschule.test_sem2_2;

public class Rechteck {
    public static double berechneUmfang(double a, double b) {
        return 2 * (a + b);
    }

    public static double berechneFlaeche(double a, double b) {
        return a * b;
    }

    public static double berechneSeitenlaengeAusUmfang(double umfang, double seite) {
        return (umfang - 2 * seite) / 2;
    }

    public static double berechneSeitenlaengeAusFlaeche(double flaeche, double seite) {
        return flaeche / seite;
    }
}
