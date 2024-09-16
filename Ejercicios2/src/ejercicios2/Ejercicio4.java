
package ejercicios2;
 import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
      
        Scanner scanner;
        scanner = new Scanner(System.in);

       
        System.out.print("Ingrese el primer número entero: ");
        int numero1 = scanner.nextInt();

        
        System.out.print("Ingrese el segundo número entero: ");
        int numero2 = scanner.nextInt();

        
        System.out.print("Ingrese el tercer número entero: ");
        int numero3 = scanner.nextInt();

       
        int mayor;
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }

        
        System.out.println("El número mayor es: " + mayor);

       
        scanner.close();
    }
}
