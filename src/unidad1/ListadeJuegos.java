package unidad1;
import java.util.Scanner;
public class ListadeJuegos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            System.out.println("¿Cuantos juegos desea agregar?");
            int cantidadJuegos = scanner.nextInt();
            scanner.nextLine();

            String[] juegos = new String[cantidadJuegos];

            for (int i = 0; i < cantidadJuegos; i++) {
                System.out.println("Ingrese el nombre del juego " + (i + 1) + ":");
                juegos[i] = scanner.nextLine();
            }

            System.out.println("Lista de juegos ingresados:");
            for (int i = 0; i < juegos.length; i++) {
                System.out.println((i + 1) + ". " + juegos[i]);
            }
        }
    }
}
