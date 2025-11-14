package unidad2;

public class Main1 {
    public static void main(String[] args) {

        Persona1 personaA = new Persona1("Camila", 13);
        Persona1 personaB = new Persona1("Julián", 24);

        personaA.presentarse();
        personaB.presentarse();

        System.out.println("¿Camila es mayor de edad? " + personaA.esMayorDeEdad());
        System.out.println("¿Julián es mayor de edad? " + personaB.esMayorDeEdad());

        System.out.println("\nJulián cumple años...");
        personaB.cumplirAnios();
        personaB.presentarse();
    }
}
