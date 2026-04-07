/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_1ejer2;
import java.util.Scanner;
/**
 *
 * @author elfra
 */
public class B6_1Ejer2 {
   
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
        String cad1;
        System.out.println("Introduce la cadena");
        cad1=teclado.nextLine();
        cadenar(cad1);
    }
    public static void cadenar(String cad1) {
        if (cad1.length()>10){
            System.out.println("--------------------------------------");
            System.out.println("La cadena resultante tras quitar 5 primeros y ultimos 2 caracteres es:");
            System.out.println(cad1.substring(5, cad1.length()-2));}
        else {System.out.println("La cadena no tiene mas de 10 caracteres");}
    }
    
}
