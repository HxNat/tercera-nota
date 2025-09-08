package unidad1;    
import java.util.Scanner;

public class ResetScanner{
public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

    System.out.print("Ingrese su edad: ");
    int edad = scanner.nextInt();
    scanner.nextLine(); // <-- limpia el salto de línea pendiente

    System.out.print("Ingrese su nombre: ");
    String nombre = scanner.nextLine();
    System.out.println("Nombre ingresado: " + nombre);
    System.out.println("Edad ingresada: " + edad);

    scanner.close();
 }
}
}