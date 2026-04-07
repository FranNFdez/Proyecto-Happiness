/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_4ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_4Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado= new Scanner (System.in);
    
    
    double iva, importe;
    int año;
    
        System.out.println("Porcentaje de IVA que quieras aplicar: ");
        iva=teclado.nextDouble();
        
        System.out.println("Año de fabricación del producto: ");
        año=teclado.nextInt();
        
        System.out.println("Importe del producto: ");
        importe=teclado.nextInt();
    
        ImporteProductos i = new ImporteProductos();
        
        System.out.printf("\nEl precio del producto con el IVA aplicado es de: %.2f\n", i.PorcentajeIVA(iva,importe));
                
        System.out.printf(""
                + "El precio del producto por el año es de: %.2f\n", i.Año(año, importe));
    
    
    
    }
    
}
