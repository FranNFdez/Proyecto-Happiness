/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_refejer1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_refEjer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double a;
    int n;
    char c;
    String op;
    System.out.printf("Introduzca el valor de la variable de tipo entero : \n");
    n = teclado.nextInt();   
    
    System.out.printf("Introduzca el valor de la variable de tipo decimal : \n");
    a = teclado.nextDouble();       
    teclado.nextLine();
    
    System.out.printf("Introduzca un operador(suma o resta): \n");
    op=teclado.nextLine();
    c = op.charAt(0);     
    
   if(c == '+')
           System.out.printf("La suma de %d %c %.2f  \n", n, c, a);
   else
        System.out.printf("La resta de %d %c %f \n", n, c, a);

    
    

// TODO code application logic here
    }
    
}
