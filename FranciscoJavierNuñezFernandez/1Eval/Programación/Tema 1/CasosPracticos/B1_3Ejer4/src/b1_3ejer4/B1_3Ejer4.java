/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer4;

/**
 *
 * @author ALUMNOS-FP
 */

import java.util.Scanner;

public class B1_3Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    
    double c, f;
    
    System.out.println("Introduce grados centigrados: ");
            
    c=teclado.nextDouble();
    
    f=32+(9*c/5);
    System.out.printf("Grados Fahrenheit: %.1f\n",f);
    
    
    
    
    
    }
    
}
