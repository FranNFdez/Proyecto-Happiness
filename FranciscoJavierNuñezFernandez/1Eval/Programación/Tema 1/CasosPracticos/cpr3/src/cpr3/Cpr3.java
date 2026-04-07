/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr3;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class Cpr3 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner(System.in);
    int t;
  
    System.out.println("Escriba la temperatura actual: ");
    t=teclado.nextInt();
    if (t>=30 && t<=50)
        System.out.println("La temperatura es extrema");
    if(t>50)
        System.out.println("Que te quemas");
    if (t<=29 && t>=2)
        System.out.println("La temperatura es baja");
    if(t<2)    System.out.println("Hace frio eh");





    }
    
}
