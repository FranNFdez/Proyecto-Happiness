/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_4ejer5;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_4Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    
    double precio,pvp;
    
        System.out.printf("Introduce el precio del libro: ");
        precio=teclado.nextDouble();
        
        pvp= precio+(precio*0.08);
        System.out.printf("El pvp es: %.2f\n",pvp);
    
    
    
    
    
    
    }
    
}
