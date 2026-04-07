/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_3ejer3;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B6_3Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               Scanner teclado = new Scanner (System.in);
        int v[]=new int [10];
        int i=0;
        int nota;
        int dim;
        int contador;
        
        System.out.println("Introduce cuantas notas hay\n");
        dim=teclado.nextInt();
        v=new int[dim];
        
        System.out.println("Introduce una nota");
        nota=teclado.nextInt();
        
        
        
        
        while (nota!=0 && i<dim){
            v[i]=nota;
            i++;
            System.out.println("Introduce una nota");
        nota=teclado.nextInt();        
        }
    }
        public static int CalcularMedia(int notas,int contador){
            float suma = 0;
            for(int i = 0 ; i < contador ; i++){
            suma+=notas;
            }
            if (contador==0){
                System.out.println("no se puede calcular la media no hay notas");}
           return notas;        
    }
}