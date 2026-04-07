/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_refejer3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_RefEjer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int a;
    System.out.println("Introduzca el numero entero que desea ingresar\n");
    a = teclado.nextInt();
    
    if (a % 2 == 0) {
    System.out.println("El número es par.");
    }
    else {
    System.out.println("El número es impar.");
    }
    System.out.printf("El valor de la variable a es: %d\n", a);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
