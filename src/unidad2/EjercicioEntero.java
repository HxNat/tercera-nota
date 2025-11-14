package unidad2;

public class EjercicioEntero {

    public static void main(String[] args) {
        int numero = 5;

        modificarEntero(numero);  // No cambia
        System.out.println("Después de modificarEntero (sin usar retorno): " + numero);

        numero = modificarEntero(numero);  // cambia
        System.out.println("Después de modificarEntero (usando retorno): " + numero);
    }

    public static int modificarEntero(int valor) {
        valor = valor * 10;  // Modifica
        return valor;        // Retorna
    }
}
