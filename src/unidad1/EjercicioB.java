package unidad1;
import java.util.Scanner;

public class EjercicioB {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double priceTshirt = 25.0;
            double pricePants = 30.0;
            double discount1 = 0.85; // 15% de descuento
            double discount2 = 0.95; // 5% de descuento

        System.out.println("Camiseta: $25.0, Pantalones: $30.0");

        System.out.println("Ingrese cantidad de camisetas: ");
          int qtyTshirt = scanner.nextInt();
        System.out.println("Ingrese cantidad de pantalones: ");
          int qtyPants = scanner.nextInt();

          double totalTshirt = 0;

          if (qtyTshirt >= 2) {
              double firstTshirt = priceTshirt * discount1;
              double otherTshirt = firstTshirt * discount2;
              totalTshirt = ((qtyTshirt - 1) * otherTshirt) + firstTshirt;
          } 
          else if (qtyTshirt == 1) {
              double finalPriceTshirt = priceTshirt * discount1;
              totalTshirt = finalPriceTshirt * qtyTshirt;
          }

          double finalPricePants = pricePants * discount1;
          double totalPants = finalPricePants * qtyPants;

          double totalPurchase = totalTshirt + totalPants;
          System.out.println("Total a pagar: " + totalPurchase);
    }
}
}