/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer10;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_3Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int contador = 0;

        System.out.print("Introduce un numero (0 para terminar): ");
        num = teclado.nextInt();
        while (num != 0) {
            if (num % 5 == 0) {
                contador++;
            }
            System.out.print("Introduce otro numero (0 para terminar): ");
            num = teclado.nextInt();
        }
        System.out.println("Multiplos de 5: " + contador);
    }
}