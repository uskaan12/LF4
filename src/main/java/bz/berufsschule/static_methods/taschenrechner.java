
package bz.berufsschule.static_methods;


public class Taschenrechner {
    
    //Eine Methode um zwei Werte zu addieren
    public static int addieren(int zahl1, int zahl2){
        return zahl1 + zahl2;
    }
    
    //Eine Methode um zwei Werte zu subtrahieren
    public static int subtrahieren(int zahl1, int zahl2){
        return zahl1-zahl2;
    }
    
    //Eine Methode um zwei Werte zu multiplizieren
    public static int multiplizieren(int zahl1, int zahl2){
        return zahl1 * zahl2;
    }
    
    //Eine Methode umd zwei Werte zu dividieren
    public static int dividieren(int zahl1, int zahl2){
        return zahl1/zahl2;
    }
    
   //Ein Methode die den Rest eine Division von zwei Zahlen zurückgibt
    public static int rest(int zahl1, int zahl2){
        return zahl1%zahl2;
    }
}
