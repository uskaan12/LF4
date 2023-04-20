package bz.berufsschule.utils;
public class Kreis {

    public static double berechneUmfang(double radius) {
        return 2 * radius * Math.PI;
    }
    public static double berechneFlaeche(double radius) {
        return radius * radius * Math.PI;
    }
    public static double berechneRadiusAusFlaeche(double flaeche) {
        return Math.sqrt(flaeche / Math.PI);
    }
    public static double berechneRadiusAusUmfang(double umfang) {
        return umfang / (2 * Math.PI);
    }
}
