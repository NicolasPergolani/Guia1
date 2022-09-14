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
public class Extras23_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        String[][] matrizsopa = new String[20][20];
        int[] posicion = new int[5];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matrizsopa[i][j] = String.valueOf((int) (Math.random() * 10));
            }
        }

        for (int i = 0; i < 5; i++) {
            boolean bandera = false;
            do {
                posicion[i] = (int) (Math.random() * 20);
                for (int j = 0; j < i; j++) {
                    if (posicion[i] == posicion[j]) {
                        bandera = true;
                        break;
                    } else {
                        bandera = false;
                    }
                }
            } while (bandera == true);
        }
        String palabra = "";
        String[][] matrizpalabra = new String[5][5];
        for (int i = 0; i < 5; i++) {
            do {
                System.out.println("Ingrese una palabra");
                palabra = leer.nextLine();
                palabra = palabra.toUpperCase();
            } while (palabra.length() > 5 || palabra.length() < 3);
            int n = (int) (Math.random() * 15);
            for (int j = 0; j < (palabra.length()); j++) {
                matrizsopa[posicion[i]][n] = palabra.substring(j, j + 1);
                n++;
            }
        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                System.out.print(matrizsopa[i][j] + " ");
            }
            System.out.println("");
        }
    }
}