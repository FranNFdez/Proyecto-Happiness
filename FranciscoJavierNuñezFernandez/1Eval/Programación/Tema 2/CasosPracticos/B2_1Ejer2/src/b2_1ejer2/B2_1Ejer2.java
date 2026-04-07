/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_1ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_1Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner (System.in);
    
    Coche c = new Coche();
    int resp, cantidad;
    
        System.out.println("Quieres acelerar (1) o frenar (pulse cualquier numero)");
        resp = teclado.nextInt();
        
        switch(resp){
            case 1:
            System.out.println("¿Cuánto acelera?");
            cantidad = teclado.nextInt();
            c.acelera(cantidad);
             
            break;
            
            default:
            System.out.println("¿Cuánto frena?");
            cantidad = teclado.nextInt();
            c.frena(cantidad);
            break;       
        } 
        
        c.acelera(cantidad);
        c.frena(cantidad);
        
        System.out.printf("Velocidad actual: %d\n", c.getVelocidad());
        
    
    
    
    
    }
    
}
