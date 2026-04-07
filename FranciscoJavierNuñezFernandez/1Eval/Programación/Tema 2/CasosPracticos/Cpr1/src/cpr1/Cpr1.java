/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class Cpr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Pajaro p, c, c2;
        p = new Pajaro();
        c = new Pajaro();
        int ed;
        String color;
        char col;
        System.out.print("Introduzca el color del loro");
        Color = teclado.nextLine;
        col = Color.charAt(0);
        System.out.print("Introduzca la edad del loro");
         ed= teclado.nextInt;

        Pajaro l = new Pajaro(col,ed);
        System.out.println("Datos iniciales de los pajaros");
        System.out.println("Canario");
        c.printEdad();
        c.printColor();
        c.setColor();
        c.setEdad();
        System.out.println("Loro");

        l.printEdad();
        l.printColor();
        System.out.println("Periquito");
        p.setEdad();
        p.printEdad();
        p.setColor('a');
        p.printColor();
        System.out.println("Modificacion de los parametros de los Pajaros");
        p.muestraPajaro();
        c2 = new Pajaro();
        p.muestraPajaro();
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
