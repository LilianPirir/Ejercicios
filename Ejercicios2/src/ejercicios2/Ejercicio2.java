
package ejercicios2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
       
        Scanner scanner;
        scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

       
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

       
        int suma = numero1 + numero2;

        
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        
        scanner.close();
    }
}
