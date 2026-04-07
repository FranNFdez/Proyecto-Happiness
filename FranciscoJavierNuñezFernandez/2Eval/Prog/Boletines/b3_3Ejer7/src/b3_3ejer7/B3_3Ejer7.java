/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b3_3ejer7;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_3Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int suma = 0;
        int contador = 0;
        double media;
        
        System.out.print("Introduce un numero (0 para terminar): ");
        num = teclado.nextInt();
        while (num != 0) {
            suma = suma + num;
            contador++;
            System.out.print("Introduce otro numero (0 para terminar): ");
            num = teclado.nextInt();
        }
        media = (double) suma / contador;
        System.out.println("La media es: " + media);
    }
}