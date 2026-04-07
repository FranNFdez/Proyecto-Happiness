/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_3ejer6;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B6_3Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        String cad;
        char []letras;
        
        System.out.println("Introduce la cadena");
        cad=teclado.nextLine();
        letras=new char[cad.length()];
        
    }
    public static char[] cargarArray(String cad, char[] array){
    
    for (int i=0; i<cad.length(); i++){
        array[i]=cad.toLowerCase().charAt(i);
    }
    return array;
    
   }
    public static void mostrarArray(char[] array){
    int cont=0;
        for (int i=0; i<array.length;i++){
            System.out.printf("%c", array[i]);
        }
    }
    public static int contarVocales(char[] array){
    int cont =0;
    
    for(int i=0; i<array.length;i++){
        if (array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u'){
        cont++;
        }
    }
    return cont;
    }
}

