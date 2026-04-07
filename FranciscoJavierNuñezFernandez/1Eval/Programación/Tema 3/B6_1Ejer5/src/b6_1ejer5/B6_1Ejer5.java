/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_1ejer5;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B6_1Ejer5 {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    String nombre, primerApell, segundoApell,cad,space=" ",resp;
    do{ 
    cad="";    
    System.out.println("Introduzca un nombre: ");
    nombre=teclado.nextLine();
 
    System.out.println("Introduzca el primero apellido: ");
    primerApell=teclado.nextLine().concat(space);
    System.out.println("Introduzca el segundo apellido: ");
    segundoApell=teclado.nextLine().concat(space);
    if(nombre.length()>=3){
    cad=primerApell.concat(segundoApell).concat(nombre.substring(0,3));
    cad=cad.toUpperCase();
    System.out.printf("%s\n",cad);
    }
    else
    { System.out.println("No se puede mostrar la información del nombre en el formato requerido");}
        System.out.println("¿Desea continuar con el formulario?(s/n)");
        resp=teclado.nextLine().toLowerCase();
    }while(resp.equals("s"));
    }

}