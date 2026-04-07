/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer1;

import java.util.Scanner;

/**
 *
 * @author ALUMNOS-FP
 */

import java.util.Scanner;
        
public class B1_3Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teclado = new Scanner(System.in);
    
    int x, xDoble, xTriple;
        
    System.out.println("Introduce un número: ");
    x=teclado.nextInt();
    xDoble=x*2;
    xTriple=x*3;
    
    System.out.printf("El doble de %d es %d\n",x,xDoble);
    System.out.printf("El doble de %d es %d\n",x,xTriple);
    
    }
    
}
