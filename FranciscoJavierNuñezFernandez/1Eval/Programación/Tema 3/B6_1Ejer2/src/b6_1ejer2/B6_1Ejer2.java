/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_1ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B6_1Ejer2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);  
        System.out.println("Introduzca la cadena deseada");
        String cadena = teclado.nextLine();
        
        pocesarCadena(cadena);
        
    }
    public static void procesarCadena(String cadena){
    int longitud = cadena.length();
    if(longitud > 10){
        for (int i = 5; i < longitud - 2; i++){
            System.out.printf(cadena.charAt(i));
        }
    
    }
    }
}
