/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer2;

/**
 *
 * @author elfra
 */
public class B3_3Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*a)*/
        int i = 2;
        int suma = 0;
        while (i < 100) {

            suma = suma + i;
            i = i + 3;
        }
        System.out.println("La suma es: " + suma);
        /* 
        b)
        int i = 2;
        int suma = 0;

        do{

            suma = suma + i;
            i = i + 3;

        } while (i < 100);

        System.out.println("La suma es: " + suma);
        
        c)
        int suma = 0;

        for (int i = 2; i < 100; i = i + 3) {
            suma = suma + i;
        }

        System.out.println("La suma es: " + suma);*/
    }
}