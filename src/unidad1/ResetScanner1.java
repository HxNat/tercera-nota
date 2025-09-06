package unidad1;
import java.util.Scanner;

public class ResetScanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int num1 = sc.nextInt();
        System.out.println("Número leído: " + num1);

        // "Reseteamos" creando un nuevo objeto
        sc = new Scanner(System.in);
        
        System.out.print("Ingrese otro número: ");
        int num2 = sc.nextInt();
        System.out.println("Número leído: " + num2);

        sc.close();
    }
}