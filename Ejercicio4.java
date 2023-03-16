/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en 
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double grados;
      System.out.println("Ingrese los grados a convertir");
      grados = leer.nextDouble();
        System.out.println("los grados en Fahrenheit es:" + (32+(9*grados/5)));
    }
    
}
