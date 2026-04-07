/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bref_ejer4;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class BRef_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    
    int c;
    System.out.println("El valor de C es: ");
    c=teclado.nextInt();
    
    if (c>=0)
    System.out.printf("El número %d es positivo\n",c);
    else
    System.out.printf("El número %d es negativo\n",c);
    
    if (c%2==0)
    System.out.printf("El número %d es par\n",c);
    else
    System.out.printf("El número %d es impar\n",c);
    
    if (c%5==0)
    System.out.printf("El número %d es multiplo de 5\n",c);
    else
    System.out.printf("El número %d no es multiplo de 5\n",c);
    
    if (c%10==0)
    System.out.printf("El número %d es multiplo de 10\n",c);
    else
    System.out.printf("El número %d no es multiplo de 10\n",c);
    
    if (c>100)
    System.out.printf("El número %d es mayor que 100\n",c);
    else if (c==100)
    System.out.printf("El número %d es igual que 100\n",c);
    else
    System.out.printf("El número %d es menor que 100\n",c);    
    }
    
}
