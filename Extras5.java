/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para
los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento
 */
package Guia1;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class Extras5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese su tipo de socio A / B / C");
        String letra = entrada.nextLine();
        letra = letra.toUpperCase();

        switch (letra) {
            case "A":
                System.out.println("Ingrese el costo del tratamiento");
                int valor = entrada.nextInt();
                System.out.println("el costo de su tratamiento será de " + valor * 0.5);

                break;
            case "B":
                System.out.println("Ingrese el costo del tratamiento");
                valor = entrada.nextInt();
                System.out.println("el costo de su tratamiento será de " + valor * 0.65);
                break;
            case "C":
                System.out.println("Ingrese el costo del tratamiento");
                valor = entrada.nextInt();
                System.out.println("Usted no tiene descuento");
                break;
            default:
                System.out.println("No ingreso un tipo de socio valido");
        }
    }
}
