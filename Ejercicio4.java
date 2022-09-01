/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner leer = new Scanner (System.in);
         double grado1, grado2;
         System.out.println("Por favor ingrese el valor en grados Centigrados");
         grado1=leer.nextDouble();
         grado2= 32+(9*grado1/5);
         System.out.println("El valor en Fahrenheit es de " + grado2+ " grados.");
    }
    
    
    
}
