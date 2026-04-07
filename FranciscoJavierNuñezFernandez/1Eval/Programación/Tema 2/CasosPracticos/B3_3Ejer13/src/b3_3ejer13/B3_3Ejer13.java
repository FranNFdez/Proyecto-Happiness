/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer13;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B3_3Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        
        System.out.println("Introduzca numero entre el 1 y el 5\nIntrocuzca 0 para terminar\n");
        num = teclado.nextInt();
        while (num != 0){
            if (num >= 1 && num <= 5)
                System.out.println("Correcto");
           else {
                System.out.println("Incorrecto");
                }
            System.out.println("Introduzca un numero del 1 al 5");
            num = teclado.nextInt();
        }
        System.out.println("Programa finalizado");

    }
    
}
