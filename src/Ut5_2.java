import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ut5_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> listaEdades = new ArrayList<>();
        int edad = sc.nextInt();
        double sumaEdades = 0;
        int contador = 0;
        int debajoMedia = 0;
        int encimaMedia = 0;
        while (edad >= 0) {
            sumaEdades += edad;
            contador++;
            listaEdades.add(edad);
            edad = sc.nextInt();
            sc.nextLine();
        }

        double media = sumaEdades/contador;

        List<Integer> listaClon = List.copyOf(listaEdades);
        Iterator<Integer> iterator = listaEdades.iterator();
        Iterator<Integer> iterator2 = listaClon.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() < media) {
                debajoMedia++;
            }
        }

        while (iterator2.hasNext()) {
            if (iterator2.next() > media) {
                encimaMedia++;
            }
        }

        System.out.printf("La edad media es: %.2f\n",media);
        System.out.printf("Hay %d personas por debajo de la media\n",debajoMedia);
        System.out.printf("Hay %d personas por encima de la media\n",encimaMedia);
    }
}
