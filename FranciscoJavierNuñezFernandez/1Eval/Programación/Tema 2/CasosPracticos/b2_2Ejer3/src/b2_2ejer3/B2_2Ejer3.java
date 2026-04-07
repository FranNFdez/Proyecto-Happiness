/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_2ejer3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_2Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner (System.in);
    Número n1;
    
    System.out.println("Para usar usar el número por defecto (1) en otro caso ponga cualquier otro número");
    int resp=teclado.nextInt(), resp2;
    
    switch (resp){
        case 1:
            n1 = new Número();
            break;
        default:
            System.out.println("Introducir número: ");
            resp=teclado.nextInt();
            n1 = new Número(resp);
    }
    
        System.out.println("El valor del número es: " + n1.getValor());
        System.out.println("El doble del número es: " + n1.getDoble());
        System.out.println("El triple del número es: " + n1.getTriple());
        
        
        System.out.println("\nIntroduce un nuevo valor: ");
        n1.setNumero(teclado.nextInt());
        
        System.out.println("El valor del número es: " + n1.getValor());
        
        System.out.println("¿Que cantidad deseas añadirle a tu número?");
        n1.aniade(teclado.nextInt());
        System.out.println("El valor del número es: " + n1.getValor());
        
        System.out.println("¿Que cantidad deseas quitar a tu número?");
        n1.resta(teclado.nextInt());
        System.out.println("El valor del número es: " + n1.getValor());
       
    
    }
    
}
