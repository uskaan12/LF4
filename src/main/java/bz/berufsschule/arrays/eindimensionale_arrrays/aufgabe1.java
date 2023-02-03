package bz.berufsschule.arrays.eindimensionale_arrrays;

/*
Erstelle ein Integer-Array mit den folgenden Zahlen darin:  55,2,99,3,7,11,22,66 Anschließend gib alles Zahlen aus die durch 11 teilbar sind. Die Ausgabe soll folgendermaßen ausschauen: 55-99-11-22-66 Achte darauf, dass bei der letzten Zahl kein Bindestrich mehr ausgegeben wird.
 */
public class aufgabe1 {
    public static void main(String[] args) {
        int[] numbers = {55, 2, 99, 3, 7, 11, 22, 66};
        StringBuilder output = new StringBuilder();

        for (int number : numbers) {
            if (number % 11 == 0) {
                output.append(number).append("-");
            }
        }

        if (output.length() > 0) {
            output.setLength(output.length() - 1);
        }

        System.out.println(output);
    }
}

