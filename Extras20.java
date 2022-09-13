/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia6;

/**
 *
 * @author Pergo
 */
public class Extras20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        imprimirVector(vector);

    }

    public static void llenarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "] ");
        }
    }
}
