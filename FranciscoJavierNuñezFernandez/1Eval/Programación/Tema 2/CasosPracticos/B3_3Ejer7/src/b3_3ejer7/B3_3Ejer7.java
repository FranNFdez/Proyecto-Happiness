/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_3ejer7;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B3_3Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        int suma = 0;
        int cont = 0;
        double media;
        System.out.printf("Introduzca sus notas de una en una: \n(Para finalizar escriba un 0)\n");
        nota = teclado.nextInt();
        while (nota != 0){
        if(nota > 0){
            suma += nota;
            cont ++;}
        nota = teclado.nextInt();}
    
        else{
    System.out.printf("La media de tus notas es de; %.2f",media)
            }
}
        
        
    
    

