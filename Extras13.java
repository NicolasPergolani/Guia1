/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el valor de n");
        int n=leer.nextInt();
        String num1="";
        for (int i = 0; i < n; i++) {
            for (int j =0; j <= i; j++) {
             System.out.print(j+1);
            }
              
            System.out.println(" ");
            
        }
    }
    
}
