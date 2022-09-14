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
public class Extras24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             Scanner leer = new Scanner(System.in);
        int N, a = 0, b = 1, suma = 0;
        System.out.println("Ingrese el tamaño del vector");
        N = leer.nextInt();
        int vector[] = new int[N];
        for (int i = 0; i < vector.length; i++) {
            suma = a + b;
            a = b;
            b = suma;
            vector[i] = suma;
            System.out.print("[" + vector[i] + "]");

    }
    
}   
  //Scanner leer = new Scanner(System.in);
//      System.out.println("ingrese la cant de números de fibonacci");
 //     int n = leer.nextInt();
 //     int[] fib = new int[n];
 //     for (int i = 0; i < n; i++) {
 //         if (i == 1 || i == 0) {
  //            fib[i] = 1;
  //        } else {fib[i]=fib[i-1]+fib[i-2];
  //        }
 //         System.out.print("["+fib[i]+"] ");

}
