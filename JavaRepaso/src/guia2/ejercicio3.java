/*
 Escribir un programa que pida una frase y la muestre toda en mayúsculas 
y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package guia2;

import java.util.Scanner;


public class ejercicio3 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        String frase;
        System.out.println("escribe una frase");
         frase = leer.nextLine();
       System.out.println(frase.toLowerCase());
       System.out.println(frase.toUpperCase());
    }
    
}
