/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa la dimension del vector");
        int[][] vector = new int[leer.nextInt()][leer.nextInt()];
        int n = 0;

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[0].length; j++) {

                System.out.println("Ingresa el numero de la posicion " + i + "" + j);
                vector[i][j] = leer.nextInt();
                n += vector[i][j];

            }
            
        }
        System.out.println("La suma de toda la matriz es: " + n);
    }

    
}
