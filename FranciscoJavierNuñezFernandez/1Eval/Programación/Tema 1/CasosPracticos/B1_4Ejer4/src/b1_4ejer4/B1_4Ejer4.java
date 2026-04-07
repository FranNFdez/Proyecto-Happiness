/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_4ejer4;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_4Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    
    String nombre;
    int nota;
           
    System.out.println("Escribe tu nombre: ");
    nombre=teclado.nextLine();
    
    System.out.println("Escribe la nota: ");
    nota=teclado.nextInt();
    
    System.out.printf("%s\t%d\n",nombre,nota);
    
    }
    
}
