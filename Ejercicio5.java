/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().*/
     Scanner leer = new Scanner (System.in);
     
         System.out.println("Ingrese un numero entero");
        int numero = leer.nextInt();
        
         System.out.println("Su numero al doble es: "+(numero*2));
        System.out.println("Su numero al triple es: "+(numero*3));
        System.out.println("La raiz cuadrada de su numero es: "+ Math.sqrt(numero));
        
    }
}