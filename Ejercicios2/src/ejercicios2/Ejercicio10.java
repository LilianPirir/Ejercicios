
package ejercicios2;
 import java.util.Scanner;


public class Ejercicio10 {
    public static void main(String[] args) {
       
        Scanner scanner;
        scanner = new Scanner(System.in);

        int mayor = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int numero = scanner.nextInt();

            if (numero > mayor) {
                mayor = numero;
            }
        }

        
        System.out.println("El número mayor ingresado es: " + mayor);

        scanner.close();
    }
}

