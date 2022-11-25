package bz.berufsschule.while_schleife;

public class aufgabe3 {
    public static void main(String[] args) {
        for (int j = 1; j < 10; j++) {
            for (int i = 1; i < 10; i++) {
                if (i == 9) {
                    System.out.print(i * j);
                } else {
                    System.out.print(i * j + ", ");
                }
            }
            System.out.println("");
            /*
            Bei println wird der Text ausgegeben und eine neue Zeile gemacht.
            Bei print wird alles in dieselbe Zeile geschrieben.
             */
        }
    }
}
