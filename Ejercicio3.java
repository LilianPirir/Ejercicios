
package ejemplos;
 import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        if (numero1 > numero2) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero1 + ", " + numero2);
        } else if (numero2 > numero1) {
            System.out.println("Los números ordenados de mayor a menor son: " + numero2 + ", " + numero1);
        } else {
            System.out.println("Los números son iguales: " + numero1);
        }

        scanner.close();
    }
}

