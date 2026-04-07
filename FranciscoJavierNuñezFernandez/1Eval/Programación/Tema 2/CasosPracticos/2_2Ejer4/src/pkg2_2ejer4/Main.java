/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2_2ejer4;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        Peso p1 = new Peso(1000, "g");
        System.out.printf("La equivalencia de tu peso en la unidad elegida es %.2f\n",p1.getPeso("K"));
        
        
    }
    
}
