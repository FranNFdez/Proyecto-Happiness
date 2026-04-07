/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer6;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B3_3Ejer6 {

    /**
     * @param args the command line arguments
     */
    final static double cantidad = 5;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double suma = 0;
        int contador = 1;
        while(contador <= cantidad){
            System.out.println("Introduzca el numero "+ contador +": ");
                double num = teclado.nextDouble();
                suma += num;
                contador++;
            }
        Media m = new Media();
        double resultado = m.calcularmedia(suma, cantidad);
           System.out.printf("La media es: %.2f\n", resultado);
        }
        }
    
    

