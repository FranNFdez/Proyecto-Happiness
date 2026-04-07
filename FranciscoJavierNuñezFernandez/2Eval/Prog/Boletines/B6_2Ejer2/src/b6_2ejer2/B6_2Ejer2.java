/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_2ejer2;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B6_2Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        char menu;
        StringBuilder cad= new StringBuilder("HOLACARACOLA");
        
        do {System.out.println("(A)Crear HOLACARACOLA\n");
            System.out.println("(B)Mostrar longitud cadena\n");
            System.out.println("(C)Cambiar cadena a 'Hay Caracolas' y mostrar por pantalla\n");
            System.out.println("(D)Cambiar cadena a 'Hay 5000 caracolas' guardar el 5000 en int");
            System.out.println("(E)Cambiar cadena a 'Hay 5000 caracolas en el mar' mostrar en pantalla");
            System.out.println("(F)Almacenar en un string los ultimos 4 caractéres y mostrarlos");
            System.out.println("(G)Mostrar la longitud final del StringBuilder");
            System.out.println("(H)Realizar el mismo ejercicio con StringBuffer");
        menu=teclado.nextLine().charAt(0);
        
        switch {
            case 'a': System.out.println(cad);;
            break;
            case 'b': System.out.println(cad.length());
            break;
            case 'c': cad=new StringBuilder("Hay Caracolas");
            break;
            case 'd': int num=5000; 
                cad.replace(4,5,"num");
}
