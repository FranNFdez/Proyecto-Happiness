/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_1ejer5;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_1Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        double precioOrig, precioActu;
        Rebajas r1 = new Rebajas();
        
        System.out.println("Introduce precio original:");
        precioOrig = teclado.nextDouble();
        
        System.out.println("Introduce precio actual:");
        precioActu = teclado.nextDouble();
        
        System.out.printf("El porcentaje aplicado es de %.2f%%\n", r1.descubrePorcentaje(precioOrig, precioActu));
                
    }
    
}
