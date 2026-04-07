/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer7;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
     
public class B1_3Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    String codigo,concepto,seccion;
    double precio, pfinal;
    int temporada;
    
        System.out.printf("Introduce el código\n");
        codigo = teclado.nextLine();
        
         System.out.printf("Concepto\n");
        concepto = teclado.nextLine();
        
         System.out.printf("Sección\n");
        seccion = teclado.nextLine();
        
         System.out.printf("Temporada\n");
        temporada = teclado.nextInt();
        
         System.out.printf("Introduce el precio\n");
        precio = teclado.nextDouble();
        
        System.out.printf("Codigo del producto: %s \n", codigo);
        System.out.printf("Concepto: %s \n", concepto);
        System.out.printf("Seccion: %s \n", seccion);
        System.out.printf("Temporada: %d \n", temporada);
        System.out.printf("Precio: %.2f \n", precio);
    
    if (temporada < 2018) {
    pfinal= precio - (precio*0.4);
    System.out.printf("El precio de la %s rebajada es %.2f",concepto,pfinal);
    } else
    System.out.printf("El producto no esta aun rebajado");
    
    
    
    
    }
    
}
