/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
import java.lang.Math;
public class B1_3Ejer3 {

    /**
     * @param args the command line arguments
     */
    final static double PI=3.1416;
    public static void main(String[] args) {
        // TODO code application logic here
    
    Scanner teclado = new Scanner(System.in);
    
    double Longitud, Area;
    int r;
    
    System.out.println("Introduce el radio: ");
    r=teclado.nextInt();
    Longitud=2*PI*r;
    Area=PI*Math.pow(r,2);
    
    System.out.printf("La longitud de la circunferencia de radio %d es:%.2f ",r, Longitud);
    System.out.printf("\nEl area de la circunferencia de radio %d es:%.2f \n",r, Area);
    
    
    
    
    }
    
}
