package Ejemplos;

import java.util.Scanner;

public class Ejemplo4{
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Introduce la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = 32 + (9.0 * celsius / 5.0);
        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);

        scanner.close();
    }
}
