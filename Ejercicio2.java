
package ejemplos;
import java.util.Scanner;


public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Por favor, ingresa un número: ");
        double numero = scanner.nextDouble();

        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        scanner.close();
    }
}

