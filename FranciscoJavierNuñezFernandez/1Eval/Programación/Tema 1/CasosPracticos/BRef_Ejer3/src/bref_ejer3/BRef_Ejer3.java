/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bref_ejer3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class BRef_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    
    int a;
    System.out.println("Escribe el valor de A: ");
    a=teclado.nextInt();    
    
    if (a%2==0)
    System.out.printf("El numero %d es par",a);
    else
    System.out.printf("El numero %d es impar\n",a);
    
    
    }
    
}
