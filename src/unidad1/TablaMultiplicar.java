package unidad1;
   
import java.util.Scanner;

public class TablaMultiplicar {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            scanner.close();
        }
    }
}
}
