/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n=leer.nextInt();
        int[]vectorB=new int[n];
        int[]vectorA=new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor del vector A en la posicion ["+(i+1)+"]");
            vectorA[i]=leer.nextInt();
            System.out.println("Ingrese el valor del vector B en la posicion ["+(i+1)+"]");
            vectorB[i]=leer.nextInt();
        }
        for (int i = 0; i < n; i++) {            
            if(vectorA[i]!=vectorB[i]){
                System.out.println("Los vectores son distintos en la posicion ["+i+"]");
                break;
            }
        }
        
    }
    
}
