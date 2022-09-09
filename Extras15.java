/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package Guia6;

import java.awt.SystemColor;
import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras15 {

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
                    suma(num1,num2);
                    break;
                case "R":
                    resta(num1,num2);                    
                    break;
                case "M":
                    multiplicacion(num1,num2);                  
                    break;
                case "D":
                    division(num1,num2);                    
                    break;
                           
                 }
                } while (!letra.equalsIgnoreCase("E"));
                System.out.println("Gracias vuelva Prontos!!");
              
                  
        }
        public static void suma(double num1,double num2){
            System.out.println("La suma es:"+(num1+num2));
}
        public static void resta (double num1, double num2){
            System.out.println("La resta es:"+(num1-num2));
        }
         public static void multiplicacion (double num1, double num2){
            System.out.println("La multiplicacion es:"+(num1*num2));
        }
          public static void division (double num1, double num2){
            System.out.println("La division es:"+(num1/num2));
        }
}     
        
    
