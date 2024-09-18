package ejemplos;

import java.util.Scanner;

public class ejemplo1 {  
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);
        
        System.out.print("Introduce el primer número: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo número: ");
        double num2 = scanner.nextDouble();
        
        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números son diferentes.");
        }
        
        scanner.close();
    }
}


