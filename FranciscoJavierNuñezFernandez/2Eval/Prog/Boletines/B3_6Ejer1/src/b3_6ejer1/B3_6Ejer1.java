/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_6ejer1;
import java.util.Scanner;
/**
 *
 * @author elfra
 */
public class B3_6Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado= new Scanner (System.in);
        System.out.println(Aprobar());
      
    }
    public static int comprobar (int n, Scanner teclado) {
        
        while (n < 0 || n>10) {
            System.out.println("Introduce un numero correcto");
        n=teclado.nextInt();}
        
        return n;
    
}
    public static int Aprobar(){
        Scanner teclado= new Scanner (System.in);
        int suma = 0;
        int nota;
        
        
    for (int i=0; i<10; i++){
        System.out.println("Introduce una nueva nota");
        nota=teclado.nextInt();
        nota=comprobar(nota, teclado);
        System.out.println(comprobar(nota, teclado));
        if (nota>=5){
            suma++;}
      
        
    }
        System.out.println("El numero de aprovados es:");
    return suma;
        }
}
