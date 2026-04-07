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
    Scanner teclado=new Scanner (System.in);
    
    Rebajas r = new Rebajas();
    double original,porcentaje,descuento;
    
        /*System.out.println("¿Cuál es el precio original?");
        original=teclado.nextDouble();
        r.setOriginal(original);
    
        System.out.println("¿Cuál es el descuento?");
        descuento=teclado.nextDouble();
        r.setRebaja(descuento);
        
        System.out.printf("El porcentaje de descuento es: %.1f%%\n", r.descubrePorcentaje());*/
        
        System.out.println("Precio original: ");
        original=teclado.nextDouble();
        
        System.out.println("Precio actual: ");
        descuento=teclado.nextDouble();
        
        System.out.printf("El porcentaje aplicado es del %.2f%%\n",r.descubrePorcentaje(original, descuento));
    }
    
}
