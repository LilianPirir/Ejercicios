package ejercicios2;

import java.util.Scanner;

public class Ejercicio11 {
    

public class ContarVocales {
    public static void main(String[] args) {
        Scanner scanner;
        scanner = new Scanner(System.in);

       
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

      
        int conteoVocales = 0;

     
        for (int i = 0; i < texto.length(); i++) {
            char c = texto.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                conteoVocales++;
            }
        }

      
        System.out.println("El número de vocales en la cadena es: " + conteoVocales);

        scanner.close();
    }
}

    
    
    
}
