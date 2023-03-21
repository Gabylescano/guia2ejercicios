
package guia2;

import java.util.Scanner;

/*Escribir un programa que pida dos números enteros por teclado y calcule la 
suma de los dos. El programa deberá después mostrar el resultado de la suma*/
public class ejercicio1 {
    public static void main(String[] args) {


        // Creamos un objeto Scanner para leer datos por teclado
        Scanner leer = new Scanner(System.in);

        // Declaramos dos variables enteras para guardar los números
        int num1, num2;
        
        // Pedimos el primer número por teclado
        System.out.println("Introduce el primer número:");
        num1 = leer.nextInt();

        // Pedimos el segundo número por teclado
        System.out.println("Introduce el segundo número:");
        num2 = leer.nextInt();

        // Calculamos la suma de los dos números y la guardamos en otra variable
        int suma = num1 + num2;
        

        // Mostramos el resultado de la suma por pantalla
        System.out.println("La suma de " + num1 + " y " + num2 + " es " + suma);
    }
}
    

