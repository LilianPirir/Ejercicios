
package ejercicios2;
 import java.util.Scanner;


public class Ejercicio5 {
   
    public static void main(String[] args) {
        
        Scanner scanner;
        scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

       
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        
        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

        
        int mediano;

        if ((numero1 >= numero2 && numero1 <= numero3) || (numero1 <= numero2 && numero1 >= numero3)) {
            mediano = numero1;
        } else if ((numero2 >= numero1 && numero2 <= numero3) || (numero2 <= numero1 && numero2 >= numero3)) {
            mediano = numero2;
        } else {
            mediano = numero3;
        }

        
        System.out.println("El número mediano es: " + mediano);

        
        scanner.close();
    }
}
