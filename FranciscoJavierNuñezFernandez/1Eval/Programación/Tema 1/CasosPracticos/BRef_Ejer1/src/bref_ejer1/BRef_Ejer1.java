/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bref_ejer1;



/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class BRef_Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     Scanner teclado = new Scanner (System.in);
    
    int n;
    double a;
    char c;
    String op;
    
    System.out.println("Variable N de tipo entero:");
    n=teclado.nextInt();
    System.out.println("Variable A de tipo decimal:");
    a=teclado.nextDouble();
      teclado.nextLine();
    System.out.println("Introduce un operador:");
    op=teclado.nextLine();
    c=op.charAt(0);
    
    System.out.printf("El valor de N es: %d, el valor de A es: %.2f y el valor de C es: %s\n",n,a,c);
    
    if (c == '+')
        System.out.printf("La suma de %d %c %.2f\n",n,c,a);
    
        else 
        System.out.printf("%.2f %c %d\n",a,c,n);
    }
    
}
