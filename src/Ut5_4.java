import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ut5_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> almacen = new ArrayList<>();
        List<String> almacenSinRepetir = new ArrayList<>();
        int cantidad;
        do {
            cantidad = sc.nextInt();
            sc.nextLine();
            if (cantidad != 0) {
                for (int i = 0; i < cantidad; i++) {
                    String producto = sc.nextLine();
                    producto = producto.toLowerCase();
                    almacen.add(producto);
                }

                for (int i = 0; i < cantidad; i++) {
                    if (!almacenSinRepetir.contains(almacen.get(i))) {
                        almacenSinRepetir.add(almacen.get(i));
                    }
                }

                System.out.println(almacenSinRepetir.size());
            }
        } while (cantidad != 0);
    }
}
