package ejercicios2;

 import java.util.Scanner;


public class Ejercicio9 {
    public static void main(String[] args) {
      
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de números que desea promediar: ");
        int n = scanner.nextInt();

     
        if (n <= 0) {
            System.out.println("La cantidad de números debe ser mayor que 0.");
            scanner.close();
            return;
        }

        double suma = 0;

   
        for (int i = 1; i <= n; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            double numero = scanner.nextDouble();
            suma += numero;
        }

       
        double promedio = suma / n;

        System.out.println("El promedio de los " + n + " números es: " + promedio);

        scanner.close();
    }
}
