/*
 Escribir un programa que lea un número entero por teclado y muestre por 
pantalla el doble, el triple y la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().

r.
 */
package ejercicio.pkg5;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     int num;
     System.out.println("Ingrese un numero");
     num = leer.nextInt();
     System.out.println("El doble del numero ingresado es" + (num*2));
     System.out.println("El triple del numero ingresado es" + (num*3));
     System.out.println("La raiz cuadrada  del numero ingresado es" + Math.sqrt(num));
    }
    
}
