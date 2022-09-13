/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import static Guia6.Extras15.division;
import static Guia6.Extras15.multiplicacion;
import static Guia6.Extras15.resta;
import static Guia6.Extras15.suma;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras15_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double num1=leer.nextInt();
        System.out.println("Ingrese el segundo numero:");
        double num2=leer.nextInt();
        menu(num1,num2,leer);
    
}
        public static void menu (double num1,double num2,Scanner leer){
            String letra="";
            
            double resultado;
            //letra=letra.toUpperCase();
            do {                  
             System.out.println("Que desea realizar suma ingrese S, resta ingresae R, multiplicacion ingrese M, division ingrese D, salir ingrese E:");
            letra=leer.next();
            switch (letra.toUpperCase()){
                case "S":
                    System.out.println(suma(num1,num2));;
                    break;
                case "R":
                    System.out.println(resta(num1,num2));                    
                    break;
                case "M":
                    System.out.println(multiplicacion(num1,num2));                
                    break;
                case "D":
                    System.out.println(division(num1,num2));;                    
                    break;
                           
                 }
                } while (!letra.equalsIgnoreCase("E"));
                System.out.println("Gracias vuelva Prontos!!");
              
                  
        }
        public static double suma(double num1, double num2){
            double s=num1+num2;
            return s;
                    
        }
           public static double resta(double num1, double num2){
            double r=num1-num2;
            return r;
                    
        }
              public static double multiplicacion(double num1, double num2){
            double m=num1*num2;
            return m;
                    
        }
                 public static double division(double num1, double num2){
            double d=num1/num2;
            return d;
                    
        }
}
