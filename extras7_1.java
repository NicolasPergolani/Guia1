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
public class extras7_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
        double prom;
        int min=10000,max=0,sum=0,num=0,cont=0;
        
        System.out.println("Ingrese cantidad de numeros a trabajar");
        int cantidad = leer.nextInt();
        
        while(cont<cantidad){
            System.out.println("ingrese numero");
        num = leer.nextInt();
        
        sum=num+sum;
        
        if(num<min){
        min=num;
        }else if (num>max){
        max=num;
        }
        cont++;
        }
      prom=(sum/num);
        System.out.println("El numero minimo es: "+min);
        System.out.println("El numero maximo es: "+max);
        System.out.println("El promedio es: "+ prom);

    }
    
}
