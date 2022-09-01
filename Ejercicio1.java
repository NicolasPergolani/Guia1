/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
         int num1, num2;
         System.out.println("Por favor ingrese el primer numero a sumar");
        num1=leer.nextInt();
         System.out.println("Por favor ingrese el segundo numero a sumar");
        num2=leer.nextInt();
        int suma;
        suma=num1+num2;
        System.out.println("El valor de la suma de los numeros es de: " + suma);
        
    }
    
}
