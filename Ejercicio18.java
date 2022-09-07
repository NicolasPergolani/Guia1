/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int[][] matriz=new int [4][4];
        int [][] matrizT=new int [4][4];
        autorellenar(matriz);
        System.out.println(" ");
        System.out.println(" ");
        mostrarMatrizB(matriz, matrizT);
       
    }
    
public static void autorellenar(int matriz[][]){
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz.length; j++) {
             matriz[i][j]= (int) (Math.random()*10);
             System.out.print(matriz[i][j]+" ");
        }
        System.out.println(" ");
    }
}   

public static void mostrarMatrizB(int matriz[][], int matrizT[][]) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matrizT[i][j] = matriz[j][i];
                System.out.print("[" +matrizT[i][j] + "]");
            }
            System.out.println(" ");
        }
    }
 

}
