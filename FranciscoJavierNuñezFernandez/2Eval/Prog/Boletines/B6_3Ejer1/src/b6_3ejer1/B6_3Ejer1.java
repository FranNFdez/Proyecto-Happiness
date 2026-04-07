/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package b6_3ejer1;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B6_3Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        String cad;
        char[] letras;
        int dim;
        
        System.out.println("Introduce una cadena");
        cad= teclado.nextLine();
        dim= cad.length();
        
        letras=new char[dim];
        
        
        LlenarArray(cad, letras);
        MostrarARray(letras);
        InvertirArray();
    }
    public static void LlenarArray(String cad, char[] array){
    for(int i=0;1<cad.length();i++){
        array[i]=cad.charAt(i);}
    }
    public static void MostrarARray(char[] array) {
    for(int i=0; i<array.length; i++){
        System.out.printf("%s\t", array[i]);}}
    public static void InvertirArray(char[] array, int dim){
        char[] invetido=new char[dim];
        int cont=0;
        for (int i=dim-1;i>=0;1--){
            invertido[cont]=array[i];
                    cont++;
        }
    }
}
