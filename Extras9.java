/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Simular la división usando solamente restas. Dados dos números enteros mayores que
uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas. Método:
Restar el dividendo del divisor hasta obtener un resultado menor que el divisor, este
resultado es el residuo, y el número de restas realizadas es el cociente.
Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer= new Scanner(System.in);
        System.out.println("Por favor ingrese el dividendo");
        int num1=leer.nextInt();
        System.out.println("Por favor ingrese el divisor");
        int num2=leer.nextInt();
        int residuo=0, cociente=0;
        while   (num1<num2){
            System.out.println("Ingrese un dividendo correcto");
            num1=leer.nextInt();
            System.out.println("Ingrese un divisor correcto");
            num2=leer.nextInt();
        }
        do {
            residuo=num1-num2;
            num1=residuo;
            cociente++;
            
        } while (num1>num2);
        System.out.println("El resultado es residuo: "+num1+" el cociente es: "+cociente);
        
        
                
    }
    
}
