/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_6ejer10;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_6Ejer10_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numcompleto;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce un número de 3 digitos");
        numcompleto=teclado.nextInt();
        
        /*
       if (numcompleto>=100 && numcompleto<=999){
            System.out.println("Las centenas son: "+ (numcompleto/100));
            System.out.println("Las decenas son: "+ ((numcompleto/10) % 10));
            System.out.println("Las unidades son: "+ (numcompleto%10));}
       else System.out.println("No es un número de 3 digitos");*/
        
           
    if (numcompleto >= 100 && numcompleto <= 999) {
    for (int i = 0; i < 3; i++) {
        System.out.println(numcompleto % 10);
        numcompleto /= 10;
        if (i==0)System.out.println("Unidades");
        if (i==1)System.out.println("Decenas");
        if (i==2)System.out.println("Centenas");
    
         
    

        
    
}}}}

    
