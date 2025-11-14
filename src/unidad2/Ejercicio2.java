package unidad2;

public class Ejercicio2 {

    public static void main(String[] args) {
        Persona persona = new Persona();     // Crea un objeto Persona
        persona.nombre = "Ana";              // Asigna nombre
        cambiarNombre(persona);              // Cambia el nombre
        System.out.println("Nombre después de cambiar: " + persona.nombre);
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "María";            // Modifica el estado del objeto
    }
}
