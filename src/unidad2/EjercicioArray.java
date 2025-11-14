package unidad2;

public class EjercicioArray {

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};

        modificarArray(numeros);

        // Mostrar los valores
        System.out.println("Valores después de modificar:");
        for (int n : numeros) {
            System.out.println(n);
        }
    }

    public static void modificarArray(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * 10;  // Modifica cada elemento
        }
    }
}
