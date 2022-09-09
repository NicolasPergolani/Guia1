/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas a comparar:");
        int personas = leer.nextInt();
        int cont=0;
        double suma=0;
        double suma2=0;
        for (int i = 0; i < personas; i++) {
            System.out.println("Ingrese la altura de la persona ["+(i+1)+"]");
            double altura = leer.nextDouble();
            if (1.61 >=altura){
                cont++;
                suma+=altura;
            }
            suma2+=altura;
        }
        System.out.println("El promedio de las personas que miden menos de 1.60 es de: "+suma/cont); 
        System.out.println("El promedio total de la altura de las personas es de: "+suma2/personas);
    }
    
}

