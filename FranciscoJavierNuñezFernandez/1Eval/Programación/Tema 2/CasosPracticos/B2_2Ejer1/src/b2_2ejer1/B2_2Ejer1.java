/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_2Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner teclado=new Scanner (System.in);   
     
     Finanzas f1;
     int resp;
     double c,cant;
     
     System.out.println("El canbio esta a 1.36 (1) o no es asi (2)");   
     resp=teclado.nextInt();   
        
     if (resp == 1)
         f1=new Finanzas();
     else
         System.out.println("Elija cambio:");
         c = teclado.nextDouble();
         f1=new Finanzas(c);
     
    System.out.println("Desea cambiar euros (1) o dólares (2)");
    resp=teclado.nextInt(); 
    
    System.out.println("Que cantidad desea cambiar");
    cant=teclado.nextDouble();
    
    if (resp == 1)
        System.out.printf("Los dolares al cambio de los euros son: %.2f", f1.eurosToDolares(cant));
    else
        System.out.printf("Los euros al cambio de los dólares son: %.2f", f1.dolaresToEuros(cant)); 
     
     }
    
}
