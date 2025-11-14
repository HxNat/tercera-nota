package unidad2;

public class Ejercicio3 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        reasignarPersona(persona);
        System.out.println("Nombre después de reasignar: " + persona.nombre);  // Debería imprimir Ana
    }

    public static void reasignarPersona(Persona persona) {
        persona.nombre = "María";
    }
}
