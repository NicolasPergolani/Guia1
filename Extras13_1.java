/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras13_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el numero que desees");
        int numero = leer.nextInt();
        String num="";
        String acum="";
        
        for (int i = 1; i <= numero; i++) {
            num=String.valueOf(i);
            acum+=num;
            System.out.println(acum);
        }
    }

    }
    

