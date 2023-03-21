/*
Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

 */
package guia2;


import java.util.Scanner;
public class ejercicio5 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        int num1;
       
        
        System.out.println("Introduce el  numero: ");
        num1 = leer.nextInt();
        System.out.println("El cuadrado del numero es: " +num1*2);
        System.out.println("El triple del numero es: " +num1*3);
        System.out.println("La raiz cuadrada es: " +Math.sqrt(num1));
    }
    
}
    
    

