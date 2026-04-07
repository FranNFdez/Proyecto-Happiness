/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_2ejer4;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_2Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.print("Introduce un numero de 3 cifras: ");
        num = teclado.nextInt();

        if (esArmstrong(num)) {
            System.out.println("El numero es Armstrong");
        } else {
            System.out.println("El numero NO es Armstrong");
        }
    }

    public static boolean esArmstrong(int num) {

        int c1, c2, c3, suma;

        c1 = num / 100;
        c2 = (num / 10) % 10;
        c3 = num % 10;

        suma = (c1 * c1 * c1) + (c2 * c2 * c2) + (c3 * c3 * c3);

        if (suma == num) {
            return true;
        } else {
            return false;
        }
    }
}