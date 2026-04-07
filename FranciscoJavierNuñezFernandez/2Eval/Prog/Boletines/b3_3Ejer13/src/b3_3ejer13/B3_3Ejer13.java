/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer13;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_3Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero (0 para terminar): ");
        num = teclado.nextInt();
        while (num != 0) {
            if (num >= 1 && num <= 5) {
                System.out.println("Numero correcto");
            } else {
                System.out.println("INCORRECTO");
            }
            System.out.print("Introduce otro numero (0 para terminar): ");
            num = teclado.nextInt();
        }
    }
}