package unidad1;

public class ContarPares {     
    public static void main(String[] args) {
        int contador = 0;

        // Recorremos del 1 al 100
        for (int i = 1; i <= 100; i++) {
             if (i % 2 == 0) { // Si es par
               contador++;
          }
         }

     System.out.println("La cantidad de números pares entre 1 y 100 es: " + contador);
  } 
}
