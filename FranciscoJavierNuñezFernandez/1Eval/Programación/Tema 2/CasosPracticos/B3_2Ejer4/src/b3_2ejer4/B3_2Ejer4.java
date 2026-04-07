/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_2ejer4;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B3_2Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int numero;    
    System.out.println("Introduzca el numero deseado");
            numero = teclado.nextInt();
    numero = comprobar(numero,teclado);
        if (programa(numero))
            System.out.println("el número es Armstrong");
        
    public static int comprobar (int n){
        while(n >= 100 && n <= 999)
            System.out.printf("Número incorrecto, introduzca un numero de tres cifras que se encuentre entre el 100 y el 999");
            n = teclado.nextInt();
    }
    public static boolean programa(int n){
    int suma = 0;
    int nRestante = n;
    int cifra;
   // int numCifras = contarCifras(n);
        while (nRestante / 10 != 0){
            cifra = nRestante % 10;
            suma += Math.pow(cifra, 3);
            nRestante /= 10;
}
            cifra = nRestante % 10;
            suma += Math.pow(cifra, 3);
            return (suma == n);
    }
    }
    

