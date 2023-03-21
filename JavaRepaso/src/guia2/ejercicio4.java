/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package guia2;

import java.util.Scanner;


public class ejercicio4 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double grados;
        System.out.println("ingrese los grados");
        grados = leer.nextDouble();
        double f;
        f = 32 + (9 * grados / 5);
        System.out.println("el equivalente en fahrenheit es: " + f);
    }
    
}
