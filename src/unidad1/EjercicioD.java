package unidad1;
import java.util.Scanner;

public class EjercicioD {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.print("Ingrese el primer número entero: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Ingrese el segundo número entero: ");
            int num2 = scanner.nextInt();

            System.out.print("Ingrese el tercer número entero: ");
            int num3 = scanner.nextInt();

           boolean resultado = (num1 > num2) && (num1 < num3);
            System.out.println("¿El primer número es mayor que el segundo y menor que el tercero? " + resultado);
            scanner.close();
        }
    }
}