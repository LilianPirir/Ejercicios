package Ejemplos;

import java.util.Scanner;

public class Ejemplo2 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Introduce tu nombre:");
            String nombre = scanner.nextLine();
            // Mostrar el mensaje de saludo
            System.out.println("Buenos días, " + nombre + "!");
            // Cerrar el scanner
        }
    }
}


