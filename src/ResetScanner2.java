public class ResetScanner2 {
public static void main(String[] args) {
    try (java.util.Scanner sc = new java.util.Scanner(System.in)) {

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // <-- limpia el salto de línea pendiente

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Nombre ingresado: " + nombre);
        System.out.println("Edad ingresada: " + edad);
    }
}
}