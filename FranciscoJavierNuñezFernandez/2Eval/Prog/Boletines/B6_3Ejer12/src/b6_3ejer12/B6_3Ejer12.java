/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_3ejer12;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B6_3Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String dim, dim2;
        char [] nombre;
        char apellido [];
        
        System.out.println("Cuantas letras tiene tu nombre?");
        dim=teclado.nextLine();
        
        System.out.println("Cuantas letras tiene tu apellido?");
        dim2=teclado.nextLine();
        
        // primer array nombre
        nombre = new char [dim.length()];
        System.out.println("vamos a introducir el nombre");
        cargarArray(nombre,dim,teclado);
        
        }
        public static void cargarArray(char[] nombre, String dim, Scanner teclado) {
        for (int i = 0; i < dim.length(); i++) {
            System.out.println("Introduce el nombre letra por letra");
            nombre[i] = dim.charAt(i);
        }
        }
}
