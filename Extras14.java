/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias");
        double n=leer.nextInt();
         System.out.println("Ingrese la cantidad de personas");
        double m=leer.nextInt();
        double promedio=m/n;
        System.out.println("El proimedio de cantidad de hijos por familia es de:"+promedio);
        
        
    }
    
}
