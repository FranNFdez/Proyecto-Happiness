/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_ejer4;

/**
 *
 * @author elfra
 */import java.util.Scanner;

public class B1_Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        double C, F;
       
        System.out.println("Introduzca los grados centígrados que desea cambiar a Fahrenheit:");
                C=teclado.nextInt();
                F=32+(9*C/5);

        System.out.println("Hay "+F+" grados Fahrenheit.");


    }
    
}
