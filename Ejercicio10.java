/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio10 {

    
     public static void main(String[] args) {
        /*10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. */
        
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Ingrese un numero valor limite positivo ");
        int numero = leer.nextInt();
       int suma=0;
         do {
             System.out.println("Ingrese un nuevo numero a sumar");
             int nuevo = leer.nextInt();
             suma = nuevo + suma;
             
         } while (suma <= numero);
         System.out.println("El resultado de la suma es: " + suma);
}
}
