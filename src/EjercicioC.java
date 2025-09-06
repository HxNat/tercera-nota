public class EjercicioC {
    public static void main(String[] args) {
        double initialAmount = 1000.0;
        double weeklyRetreat = 200.0;
        int weeks = 4;

        double finalAmount = initialAmount - (weeklyRetreat * weeks);
        double amountRetreated = weeklyRetreat * weeks;
        System.out.println("Cantidad inicial: $" + initialAmount);
        System.out.println("Retiro semanal: $" + weeklyRetreat);
        System.out.println("Cantidad retirada: $" + amountRetreated);
        System.out.println("Cantidad final en el banco después de " + weeks + " semanas: $" + finalAmount);
    }
}