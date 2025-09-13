package unidad1;

import java.util.Scanner;

public class PromedioArray {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
        double[] numeros = new double[5]; // Array de tamaño 5
        double suma = 0;

        // Leer 5 números del usuario
        System.out.println("Ingrese 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i]; // Acumular suma
        }

        // Calcular promedio
        double promedio = suma / numeros.length;

        // Mostrar resultado
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        sc.close();
    }
}  
}
