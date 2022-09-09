/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        /*1. Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.*/
        
        System.out.println("Ingrese cantidad de minutos");
        int minutos = leer.nextInt();
        
        double horas = minutos/60;
        double dias = horas/24;
        double horas2 = horas - Math.floor(dias)*24; 
        System.out.println("La cantidad de horas es de "+ horas);
        System.out.println(Math.floor(dias)+" dias "+ horas2 + " horas.");
        
         
    }
}


