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
public class Extras21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double[] v = new double[10];
        rellenarv(v);
        contar(v);

    }

    public static void rellenarv(double[] v) {
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("ingrese la nota del primer parcial del alumno " + i);
            double p1 = leer.nextInt() * 0.1;
            System.out.println("ingrese la nota del segundo parcial del alumno " + i);
            double p2 = leer.nextInt() * 0.15;
            System.out.println("ingrese la nota del primer integrador del alumno " + i);
            double i1 = leer.nextInt() * 0.25;
            System.out.println("ingrese la nota del segundo parcial del alumno " + i);
            double i2 = leer.nextInt() * 0.5;
            v[i] = p1 + p2 + i1 + i2;
        }

    }

    public static void contar(double[] v) {
        int contd=0;int conta=0;
        for (int i = 0; i < 10; i++) {
            if(v[i]<7){
            contd++;}else{conta++;}
        }
        System.out.println("la cantidad de alumnos aprobados es de "+conta+" y la de desaprobados es de "+contd);
}