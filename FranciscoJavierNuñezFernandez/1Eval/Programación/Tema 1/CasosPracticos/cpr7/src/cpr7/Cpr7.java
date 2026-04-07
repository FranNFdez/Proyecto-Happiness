/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr7;

/**
 *
 * @author ALUMNOS-FP
 */
 import java.util.Scanner;
public class Cpr7 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
    String cad1 = "CICLO DAM",cad2 = "ciclo dam";
    int l;
    System.out.printf("La cadena 1 es: %s \nLa cadena 2 es: %s \n",cad1, cad2);
    l=cad1.length();
    System.out.printf("La longitud de la  cadena %s es: %d \n",cad1, l);
    System.out.printf("El resultado de la concatenacion es:%s",cad1.concat(cad2));
    if (cad1.equals(cad2))
        System.out.println("\nlas cadenas son iguales");
    else
        System.out.println("\nlas cadenas son distintas");
    
    System.out.printf("\nla primera palabra de la cadena 1 es---> %s", cad1.substring(0,5));
    System.out.printf("\nla longitud de la cadena 2 es---> %d", cad1.length());
    System.out.printf("\nla cadena 1 en minusculas es---> %s", cad1.toLowerCase());








        // TODO code application logic here
    }
    
}
