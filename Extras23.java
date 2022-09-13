/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
23. Construya un programa que lea 5 palabras de mínimo 3 y hasta 5 caracteres y, a medida
que el usuario las va ingresando, construya una “sopa de letras para niños” de tamaño de
20 x 20 caracteres. Las palabras se ubicarán todas en orden horizontal en una fila que
será seleccionada de manera aleatoria. Una vez concluida la ubicación de las palabras,
rellene los espacios no utilizados con un número aleatorio del 0 al 9. Finalmente imprima
por pantalla la sopa de letras creada.
Nota: Para resolver el ejercicio deberá investigar cómo se utilizan las siguientes funciones
de Java substring(), Length() y Math.random().
 */
package Guia6;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[][] matriz = new String[20][20];
        rellenar(matriz, leer);
        mostrar (matriz);
    }

    public static void rellenar(String[][] matriz, Scanner leer) {
        String frase = "";
        //StringBuffer sb = new StringBuffer(  10 );
        //if (palabra.substring(i, i+1).equals("3"))&&(palabra.length()<2)
        //int numEntero = Integer.parseInt(numCadena);
        String[]vector={"0","1","2","3","4","5","6","7","8","9"};
        for (int i = 0; i < 5; i++) {

            do {
                System.out.println("Ingrese la palabra nro[" + (i + 1) + "]");
                frase = leer.next();
            } while (frase.length() < 3 || frase.length() > 5);
            for (int j = 0; j < 20; j++) {
                for (int k = 0; k < 20; k++) {

                    int a = (int) Math.random() * 20;
                    int b = (int) Math.random() * 14;

                    if (matriz[a][b] == "" && matriz[a][b + 1] == "" && matriz[a][+b + 2] == "" && matriz[a][b + 3] == "" && matriz[a][b + 4] == "") {
                        matriz[(int) Math.random() * 19][(int) Math.random() * 15] = frase;
                    }
                }

            }

        }
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                if (matriz[i][j]=="")
                    matriz[i][j]=vector[i];//Integer.parseInt((int) Math.random() * 9);
            }
            
        }
    }
    public static void mostrar(String[][] matriz){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+matriz[i][j]);
            }
                  
            System.out.println("");
        }
    }
            
}
