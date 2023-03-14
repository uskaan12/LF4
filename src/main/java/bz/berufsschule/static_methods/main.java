
package bz.berufsschule.static_methods;


public class Main {
    
    
    public static void main(String[] args) {
        
        int[] array1 = {1,5,69,1156,154,564,24,69,8};
        int[] array2 = {445,898,23645,4252,8235,9741,135,5184,88};
        
        //Arrays in der Konsole ausgeben.
        Array_Utils.print_Array_With_Blanks(array1);
        Array_Utils.print_Array_With_Blanks(array2);
        
        
        //Erstelle ein Array mit länge 50 und fülle es mit Zufallzahlen zwischen 1 und 100
        //und gib es in der Konsole aus
        int[] array = new int[50];
        Array_Utils.fill_Array_With_Random_Numbers(array, 1, 100);
        Array_Utils.print_Array_With_Blanks(array);
        
        //Gib die Summe aller Zahlen im Array aus!
        //Achtung: Wenn eine Methode einen Rückgabewert hat, sollte dieser in einer Variable 
        //gespeichert werden!
        int summe = Array_Utils.sum_All_Values_In_Array(array);
        System.out.println("Die Summe aller Zahlen im Array lautet: " + summe);
        
        int min = Array_Utils.find_Smallest_Element(array);
        System.out.println("Die kleinste Zahl im Array lautet: " + min);
        
        int max = Array_Utils.find_Largest_Element(array);
        System.out.println("Die größte Zahl im Array lautet: " + max);
        
        double avg = Array_Utils.calculate_Average_Of_All_Elements(array);
        System.out.println("Der Durchschnittwert lautet : " + avg);
    }
}
