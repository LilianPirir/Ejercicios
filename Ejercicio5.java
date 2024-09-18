
package ejemplos;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.print("Ingresa el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingresa el mes (1-12): ");
        int mes = scanner.nextInt();

        System.out.print("Ingresa el año: ");
        int año = scanner.nextInt();

        boolean fechaValida = false;

        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 1, 3, 5, 7, 8, 10, 12 -> {
                   
                    if (dia >= 1 && dia <= 31) {
                        fechaValida = true;
                    }
                }
                case 4, 6, 9, 11 -> {
             
                    if (dia >= 1 && dia <= 30) {
                        fechaValida = true;
                    }
                }
                case 2 -> {
                    
                    if (dia >= 1 && dia <= 28) {
                        fechaValida = true;
                    }
                }
                default -> {
                }
            }
        }


        if (fechaValida) {
            System.out.println("La fecha es correcta: " + dia + "/" + mes + "/" + año);
        } else {
            System.out.println("La fecha es incorrecta.");
        }

        scanner.close();
    }
}
