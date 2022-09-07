/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leer = new Scanner(System.in);
        System.out.println("ingrese la cantidad de números que tendrá el vector");
        int[] vector = new int[leer.nextInt()];
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 99999 + 1);
            System.out.print(vector[i] + " ");
            
        }
        System.out.println("");
buscardig(vector);
    }

    public static void buscardig(int[] vector) {
        int c1, c2, c3, c4, c5;
        c1 = 0;
        c2 = 0;
        c3 = 0;
        c4 = 0;
        c5 = 0;
        for (int i = 0; i < vector.length; i++) {
            int l = String.valueOf(vector[i]).length();
            switch (l) {
                case 1:
                    c1++;
                    continue;
                case 2:
                    c2++;
                    continue;
                case 3:
                    c3++;
                    continue;
                case 4:
                    c4++;
                    continue;
                case 5:
                    c5++;
                    continue;

            }
        }
        System.out.println("con un dígito: " + c1);
        System.out.println("con dos dígitos: " + c2);
        System.out.println("con tres dígitos: " + c3);
        System.out.println("con cuatro dígitos: " + c4);
        System.out.println("con cinco dígitos: " + c5);
    }
    

