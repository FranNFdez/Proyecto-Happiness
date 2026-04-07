/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_3ejer3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B6_3Ejer3 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner (System.in);
 
   int i=0;
   int resp, dim;
   int[] notas;
        //PARA SABER EL TAMAÑO DEL ARRAY
        System.out.println("Cantidad máxima de exámenes: ");
        dim=teclado.nextInt();
        notas=new int[dim];
        System.out.println("Escriba un número (0 para salir): ");
        resp=teclado.nextInt();
    while(resp!=0 && i<dim){
        //CON ESTO METES EL NÚMERO EN LA POSICION CORRESPONDIENTE
        notas[i]=resp;
        //CON ESTO VAS SUMANDO NÚMEROS PARA CAMBIAR DE CELDA Y NO PERDER DATOS
        i++;
        System.out.println("Escriba un número: ");
        resp=teclado.nextInt();

    }
    imprimir(notas,i);
    System.out.printf("La media es: %d",media(notas,i));
    }
    public static void imprimir(int [] notas, int contador){
        for(int i=0; i<contador; i++){
            System.out.printf("%d\t",notas[i]);
        }
    }
    public static double media(int [] notas, int contador){
        double suma=0;
        for(int i=0; i<contador; i++){
            suma+=notas[i];
        }
        if(contador==0){
            System.out.println("No hay notas");
            return 0;
        }
        else
        return suma/contador;
    }
}