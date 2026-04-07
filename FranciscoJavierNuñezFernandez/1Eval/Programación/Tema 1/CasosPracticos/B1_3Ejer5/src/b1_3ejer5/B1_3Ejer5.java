/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer5;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
import java.lang.Math;
      
public class B1_3Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    double kmh, ms;
        System.out.println("Introducec los km/h: ");
        kmh=teclado.nextDouble();
        ms= kmh*10/36;
        System.out.printf("La equivalencia de %.2f km/h son: %.2f m/s\n",kmh,ms);
        System.out.println("La equivalencia de "+kmh+" km/h son "+ms+" m/s");
        
    
    
    }
    
}
