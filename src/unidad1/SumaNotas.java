package unidad1;
import java.util.Scanner;

public class SumaNotas {
    public static void main(String[] args) {
        try( Scanner sc = new Scanner(System.in)) {
        double[] notas = new double[10]; // Arreglo fijo de tamaño 10
        double suma = 0;

        // Leer las 10 notas
        System.out.println("Ingrese 10 notas (entre 1.0 y 5.0):");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            suma += notas[i]; // Acumula la suma
        }

        // Calcular promedio
        double promedio = suma / notas.length;

        // Mostrar resultados
        System.out.println("\nLa suma de todas las notas es: " + suma);
        System.out.println("El promedio de las notas es: " + promedio);

        sc.close();
    }
}
}