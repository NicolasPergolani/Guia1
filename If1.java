/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Pergo
 */
public class If1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opinion;
        Scanner leer= new Scanner(System.in);
        System.out.println("Ingrese la valoracion de la pelicula");
        opinion=leer.nextInt();
        if (opinion>=1 && opinion<= 5) {
         
            switch (opinion)    {
                case 1:
                case 2:
                    System.out.println("Nos sentimos apenados que no hayas disfrutado la peli...");
                    break;
                case 3:
                    System.out.println("Has calificado la peli como buena");
                    break;
                case 4:
                    System.out.println("Has calificado la peli como muy buena");
                    break;
                case 5: 
                    System.out.println("Fantastico que hayas disfrutado la pelicula");
                    break;
                    
            }
                     }else if (opinion < 0) {
                             System.out.println("Una opinion negativa? sos un gato"); 
                    } else if (opinion==0) {
                            System.out.println("El valor" + opinion+ " no es valido y no se tomara en cuenta");
                    }else {
                            System.out.println("Wow se te fue la mano con la calificacion");
                     }  
                    System.out.println("Hasta la proxima");
                            
    }    

}

  