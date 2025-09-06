public class Constantes {

    public void calcularCircunferencia() {
    final double PI = 3.14159;
    double radio = 10;
    double circunferencia = 2 * PI * radio;

    System.out.println("La circunferencia es: " + circunferencia);
 }
 public static void main(String[] args) {
    double radio = 5;
    double area = 3.14159 * radio * radio;

    System.out.println("El área del círculo es: " + area);

    final int DIAS_SEMANA = 7;
    final double GRAVEDAD_TIERRA = 9.8;

    System.out.println("Días en una semana: " + DIAS_SEMANA);
    System.out.println("Gravedad en la Tierra: " + GRAVEDAD_TIERRA + " m/s²");
}
}
