/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.lang.Math;
import java.util.Scanner;
public class B1_3Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner (System.in);
        double a,b,h;
        System.out.println("Escribe los catetos: ");
    a=teclado.nextDouble();
    b=teclado.nextDouble();
    h= Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    
        System.out.println("La hipotenusa es: "+h);
    
    
    
    
    
    }
    
}
