package unidad2;

public class EjercicioString {

    public static void main(String[] args) {
        String texto = "Hola";

        modificarString(texto);  
        System.out.println("Después de modificarString (sin usar retorno): " + texto);

        texto = modificarString(texto);
        System.out.println("Después de modificarString (usando retorno): " + texto);
    }

    public static String modificarString(String cadena) {
        cadena = cadena + " Mundo";  // Crea una nueva cadena
        return cadena;               // Retorna la nueva
    }
}
