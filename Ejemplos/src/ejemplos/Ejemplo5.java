package ejemplos;
    
    
    import java.util.Scanner;

public class Ejemplo5 {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

        final double PI = Math.PI;

        System.out.print("Introduce el valor del radio de la circunferencia: ");
        double radio = scanner.nextDouble();

        double longitud = 2 * PI * radio;
        double area = PI * Math.pow(radio, 2);

        System.out.printf("La longitud de la circunferencia es: %.2f\n", longitud);
        System.out.printf("El área de la circunferencia es: %.2f\n", area);

        scanner.close();
    }
}

    
    
    
    
    
    
    