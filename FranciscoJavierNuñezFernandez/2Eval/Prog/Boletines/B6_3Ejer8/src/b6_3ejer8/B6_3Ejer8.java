/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b6_3ejer8;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B6_3Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        String cad;
        char[] texto;
        
        System.out.println("Introduce una cadena");
        cad=teclado.nextLine();
        
        texto = new char[cad.length()];
        
        cargarArray(cad, texto);
        
       if (compararArray(texto)){
           System.out.println("Es palindroma");}
       else {System.out.println("No es palindromo");
       }
    }
 
    public static String cargarArray(String cad, char[] array){
    for (int i = 0; i < cad.length(); i++) {
            
            array[i] = cad.charAt(i);
    } 
    return cad;
  
 }
    public static boolean compararArray(char[] array){
        int j = array.length-1;
        boolean palindroma=true;
        
        for (int i=0; i<array.length/2; i++){
            if (array[i]!=array[j]){
            palindroma=false;
            break;}
            j--;
        } return palindroma=true;
    }
}
