package unidad2;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero = 10;
        System.out.println("Antes: " + numero);
        
        cambiarNumero(numero);
        
        System.out.println("Después: " + numero);
    }

    public static void cambiarNumero(int n) {
        n = 50; // Intentamos cambiar el valor
        System.out.println("Dentro: " + n);
    }
}
