/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_7ejer1;

import java.util.Scanner;

/**
 *
 * @author elfra
 */

public class B6_7Ejer1 {

    /**
     * @param args the command line arguments
     */
    final static int dim = 5;
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int [] edad = new int [dim];
          
        edad=cargarEdad(edad,teclado);
        edad=ordenarEdad(edad);
        mostrarArray(edad, dim);
        System.out.println(calcularMedia(edad));    
    }
    
    public static int[] cargarEdad(int[] array, Scanner teclado){
        for (int i=0; i<array.length; i++){
            System.out.println("Introduce edad");
        array[i]=comprobarEdad(teclado);}
    return array;
    }
    public static int[] ordenarEdad(int[] array){
        int aux;
        for (int i=0; i<array.length-1; i++){
            for (int j=i+1; j<array.length; j++){
                if (array[i]<array[j]){
                    aux= array[j];
                    array[j] = array[i];
                    array[i] = aux;
                }
            }
        }
    return array;
    }
    
    public static void mostrarArray(int[] array, int lon){
        for(int i=0; i<lon;i++){
        System.out.printf("La letara en la posciion %d es: %d\n", i,array[i]);
        }    
    }
    
    public static double calcularMedia(int[] array) {

        float suma = 0;
        
        for (int i = 0; i < array.length; i++) {
            suma += array[i];
        }
        float media= suma/array.length;
        System.out.println("La media es: ");
        
        return media;
    }
    
    public static int comprobarEdad(Scanner teclado){
    int n= teclado.nextInt();
    for (int i=0; i<10; i++){
        while (n<1 || n>120){
            System.out.println("Edad erronea");
            n=teclado.nextInt();
            
        }
    }
    return n;}
    
    public static void mayoresEdad(int[] array){
    
    int [] mayores= new int [array.length];
    int mayor=0;
    for (int i=0; i<array.length;i++){
        if(array[i]>=18){
            mayores[mayor]=array[i];
            mayor++;}
    }
    }
}
