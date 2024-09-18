package ejemplos;
  import java.util.Scanner;


public class Ejercicio4 {
      public static void main(String[] args) {
        Scanner scanner;
          scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double numero3 = scanner.nextDouble();

 
        if (numero1 >= numero2 && numero1 >= numero3) {
            System.out.print("El orden de mayor a menor es: " + numero1 + ", ");
            if (numero2 >= numero3) {
                System.out.println(numero2 + ", " + numero3);
            } else {
                System.out.println(numero3 + ", " + numero2);
            }
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            System.out.print("El orden de mayor a menor es: " + numero2 + ", ");
            if (numero1 >= numero3) {
                System.out.println(numero1 + ", " + numero3);
            } else {
                System.out.println(numero3 + ", " + numero1);
            }
        } else {
            System.out.print("El orden de mayor a menor es: " + numero3 + ", ");
            if (numero1 >= numero2) {
                System.out.println(numero1 + ", " + numero2);
            } else {
                System.out.println(numero2 + ", " + numero1);
            }
        }

        scanner.close();
    }
}
