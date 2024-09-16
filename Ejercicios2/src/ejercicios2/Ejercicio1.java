
package ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       
        Scanner scanner;
        scanner = new Scanner(System.in);

       
        System.out.print("Por favor, ingresa tu edad: ");
        int edad = scanner.nextInt();

        
        if (edad > 18) {
            System.out.println("MAYOR DE EDAD");
        } else {
            System.out.println("MENOR DE EDAD");
        }
        scanner.close();
    }
}

