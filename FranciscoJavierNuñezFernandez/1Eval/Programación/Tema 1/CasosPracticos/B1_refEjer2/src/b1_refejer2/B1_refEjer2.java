/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_refejer2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_refEjer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a, b, c, d;
    System.out.printf("Introduzca el valor de la variable a: \n");
    a = teclado.nextInt();   
    System.out.printf("Introduzca el valor de la variable b: \n");
    b = teclado.nextInt();
    System.out.printf("Introduzca el valor de la variable c: \n");
    c = teclado.nextInt(); 
    System.out.printf("Introduzca el valor de la variable d: \n");
    d = teclado.nextInt();     
    System.out.printf("El valor de a = %d, el valor de b= %d, El valor de c = %d, El valor de d = %d\n", a, b, c, d);
    
    if (a > b){
       b = c;
      System.out.printf("El valor de b pasa a ser el de c = %d\n", b);}
    else
        a = d;
    System.out.printf("El valor de a pasa a ser el de d = %d\n", a);
        // TODO code application logic here
    }
    
}
