package unidad2;

public class Persona1 {

    private String nombre;
    private int edad;

    public Persona1(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void presentarse() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public boolean esMayorDeEdad() {
        return edad >= 18;
    }

    public void cumplirAnios() {
        edad++;
    }
}
