package unidad1;

import java.util.Scanner;

public class FactorialWhile {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) { 

        // Pedir el número al usuario
        System.out.print("Ingresa un número entero: ");
        int numero = sc.nextInt();

        int i = 1;
        long factorial = 1; // Usamos long para números grandes

        // Ciclo while para calcular factorial
        while (i <= numero) {
            factorial *= i; 
            i++;
        }

        // Mostrar el resultado
        System.out.println("El factorial de " + numero + " es: " + factorial);

        sc.close();
    }
}
}
