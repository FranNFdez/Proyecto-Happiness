/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franext6;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class FranExT6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] vector = new int[10];

        // llenar array con números aleatorios
        for(int i = 0; i < vector.length; i++){
            vector[i] = r.nextInt(10) + 1;
        }

        // mostrar array
        System.out.println("Vector original:");
        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }

        // ordenar de mayor a menor
        for(int i = 0; i < vector.length; i++){
            for(int j = i + 1; j < vector.length; j++){

                if(vector[i] < vector[j]){
                    int aux = vector[i];
                    vector[i] = vector[j];
                    vector[j] = aux;
                }

            }
        }

        System.out.println("\nVector ordenado:");

        for(int i = 0; i < vector.length; i++){
            System.out.print(vector[i] + " ");
        }

        // contar aprobados
        int contador = 0;

        for(int i = 0; i < vector.length; i++){
            if(vector[i] >= 5){
                contador++;
            }
        }

        int[] aprobados = new int[contador];

        int pos = 0;

        for(int i = 0; i < vector.length; i++){
            if(vector[i] >= 5){
                aprobados[pos] = vector[i];
                pos++;
            }
        }

        System.out.println("\nVector aprobados:");

        for(int i = 0; i < aprobados.length; i++){
            System.out.print(aprobados[i] + " ");
        }

    }

}