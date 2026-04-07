/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_3ejer6;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_3Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner(System.in);
    String nombre;
    int nota;
             
    System.out.println("Introduce nombre: ");
    nombre = teclado.nextLine();
    
    System.out.println("Introduce nota: ");
    nota = teclado.nextInt();
    
    if (nota >= 5) {
    System.out.printf("%S\tAPTO\n",nombre);
    } else {
    System.out.printf("%S\tNO APTO\n",nombre);
    }
    
    }
    
}
