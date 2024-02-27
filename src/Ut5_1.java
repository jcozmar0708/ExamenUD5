import java.util.Set;
import java.util.TreeSet;

public class Ut5_1 {
    public static void main(String[] args) {
        Set<String> apuesta = new TreeSet<>();
        String[][] primitiva = {
                {"  ", " 1", " 2", " 3", " 4", " 5", " 6", " 7", " 8", " 9"},
                {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19"},
                {"20", "21", "22", "23", "24", "25", "26", "27", "28", "29"},
                {"30", "31", "32", "33", "34", "35", "36", "37", "38", "39"},
                {"40", "41", "42", "43", "44", "45", "46", "47", "48", "49"}
        };

        do {
            int numero = (int) (Math.random()* 49 + 1);
            String numeroCadena = String.valueOf(numero);
            if (numero < 10) {
                numeroCadena = " " + numero;
            }
            apuesta.add(numeroCadena);
        } while (apuesta.size() < 6);

        System.out.println("Apuesta: " + apuesta);

        System.out.println();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < primitiva[i].length; j++) {
                if (apuesta.contains(primitiva[i][j])) {
                    primitiva[i][j] = "XX";
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(primitiva[i][j] + " ");
            }
            System.out.println();
        }
    }
}
