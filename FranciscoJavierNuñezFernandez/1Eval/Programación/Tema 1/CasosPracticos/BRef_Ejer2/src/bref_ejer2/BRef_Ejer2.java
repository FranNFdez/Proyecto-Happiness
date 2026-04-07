/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bref_ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class BRef_Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    
    int a,b,c,d;
    System.out.printf("El valor de A es:");
    a=teclado.nextInt();
    System.out.printf("El valor de B es:");
    b=teclado.nextInt();
    System.out.printf("El valor de C es:");
    c=teclado.nextInt();
    System.out.printf("El valor de D es:");
    d=teclado.nextInt();
    
    if (a>b){
    b=c;
    System.out.printf("El valor de B es: %d",c);
    }
    else
    a=d;
    System.out.printf("El valor de A es: %d\n",d);
    
    
    
    }
    
}
