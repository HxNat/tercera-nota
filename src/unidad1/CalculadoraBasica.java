package unidad1;

    import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)){

        // Mostrar menú
        System.out.println("=== Calculadora Básica ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.print("Seleccione una opción (1-4): ");
        int opcion = sc.nextInt();

        // Leer los números
        System.out.print("Ingrese el primer número: ");
        double num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        double resultado;

        // Estructura switch
        switch (opcion) {
            case 1:
                resultado = num1 + num2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = num1 - num2;
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = num1 * num2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case 4:
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("Error: No se puede dividir entre 0.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
                break;
        }

        sc.close();
    }
}
}
