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
public class Extra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese un numero del 1 al 10");
        int num = entrada.nextInt();

        switch (num) {
            case 1:
                System.out.println(num + " =I");
                break;
            case 2:
                System.out.println(num + " =II");
                break;
            case 3:
                System.out.println(num + " =III");
                break;
            case 4:
                System.out.println(num + " =IV");
                break;
            case 5:
                System.out.println(num + " =V");
                break;
            case 6:
                System.out.println(num + " =VI");
                break;
            case 7:
                System.out.println(num + " =VII");
                break;
            case 8:
                System.out.println(num + " =VIII");
                break;
            case 9:
                System.out.println(num + " =IX");
                break;
            case 10:
                System.out.println(num + " =X");
                break;
            default:
                System.out.println("El numero no esta entre el 1 y 10");

        }

    }

}