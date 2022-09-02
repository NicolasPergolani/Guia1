/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = leer.nextInt();

        String respuesta = " ";
        do {
            
            System.out.println("Ingrese una opcion, 1= sumar, 2= restar, 3= multiplicar, 4= dividir, 5= salir");
            int num3 = leer.nextInt();

            switch (num3) {
                case 1:
                    System.out.println("La suma de los numeros es igual a :" + (num1 + num2));
                    continue;
                case 2:
                    System.out.println("La resta de los numeros es igual a :" + (num1 - num2));
                    continue;
                case 3:
                    System.out.println("La multiplicacion de los numeros es igual a :" + (num1 * num2));
                    continue;
                case 4:
                    double division=num1/num2;                      
                    System.out.println("La division de los numeros es igual a :" + (division));
                    continue;
                case 5:
                    System.out.println("Desea salir, responder S/N");
                    respuesta = leer.next();
                                       
                     
                   
                    
            }
             
             
        }while (!respuesta.equalsIgnoreCase("s"));
            
            System.out.println("Gracias vuelva prontos.");
    }       
    

    }
