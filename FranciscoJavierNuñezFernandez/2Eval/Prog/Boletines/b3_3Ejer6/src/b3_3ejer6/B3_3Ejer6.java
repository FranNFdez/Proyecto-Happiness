/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer6;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_3Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        int suma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Introduce un numero: ");
            num = teclado.nextInt();

            suma = suma + num;
        }

        media = suma / 5.0;

        System.out.println("La media es: " + media);
    }
}