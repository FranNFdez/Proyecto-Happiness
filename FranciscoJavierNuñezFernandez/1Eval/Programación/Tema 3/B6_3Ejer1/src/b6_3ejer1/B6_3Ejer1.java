/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_3ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B6_3Ejer1 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
    String cad;
    char[] letras, invertido;
    int dim;
        System.out.println("Introduzir la cadena");
        cad=teclado.nextLine();
        dim=cad.length();
        letras=new char[dim];
        invertido=new char[dim];
        llenarArray(cad, letras);
        imprimirArray(letras);
        invertirArray(letras,dim);
        }
    public static void imprimirArray(char[] array){
       for(int i=0; i<array.length; i++){
            System.out.printf("%s\t",array[i]);
        } 
        System.out.println("");
    }
    public static void llenarArray(String cad, char[] array){
        for(int i=0; i<cad.length(); i++){
            array[i] = cad.charAt(i);
        }
    }
    public static void invertirArray(char[] array, int dim){
        char[] invertido=new char[dim];
        int cont=0;
        for(int i=dim-1; i>=0; i--){
          invertido[cont]=array[i];
          cont++;
        }
        imprimirArray(invertido);
    }

}