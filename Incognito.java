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
public class Incognito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              String frase, codificador = " ", aux;
        Scanner leer = new Scanner (System.in);
        frase = leer.nextLine();
        int j= frase.length();
        
        for (int i=0; i< j ;i++){
        switch (frase.substring(i, i+1)){
            case "A":
            case "a":
             
               codificador=codificador.concat("@");
              
                    break;
            case "E":
            case "e":
                 codificador=codificador.concat("#");
               
                    break;
            case "I":
            case "i":
                 codificador=codificador.concat("$");
               
                    break;
            case "O":
            case "o":
                 codificador=codificador.concat("$");
               
                    break;
            case "U":
            case "u":
                 codificador=codificador.concat("$");
               
                    break;        
            default :
                codificador = codificador.concat(frase.substring(i,i+1)); 
               
        }
        
        }
     System.out.print(codificador);
            }
        
}
    }
}
