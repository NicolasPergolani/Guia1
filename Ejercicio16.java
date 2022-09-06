/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el
numero y si se encuentra repetido
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del verctor: ");
        int n = leer.nextInt();
        System.out.println("Que numero desea encontrar en el vector: ");
        int buscar = leer.nextInt();
        int[] vector = new int[n];
        llenarvector(n, vector, n);
        
        
    }
     public static void llenarvector(int n, int[] vector, int buscar) {

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random() * 10+1);
        }
     
        for (int i = 0; i < vector.length; i++) {
            if (buscar == vector[i]);
            System.out.println("Su numero se encuentra en el espacio:  " + vector[i] + "  del vector");
        }
       

    }

}

