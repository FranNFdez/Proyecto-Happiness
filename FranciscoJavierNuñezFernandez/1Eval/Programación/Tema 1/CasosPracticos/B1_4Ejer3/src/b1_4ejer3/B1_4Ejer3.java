/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_4ejer3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
import java.lang.Math;
public class B1_4Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    
    int lado;
    double acuadrado,acubo;
    
    System.out.println("La longitud del lado es: ");
    lado=teclado.nextInt();
    
    acuadrado=Math.pow(lado, 2);
    acubo=6*acuadrado;
    
    System.out.printf("El area del cuadrado es: %.2f\n",acuadrado);
    System.out.printf("El area del cubo es: %.2f",acubo);
    
    
    }
    
}
