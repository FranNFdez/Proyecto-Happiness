/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_6ejer2;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B3_6Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int num,num2,acum;
        acum=0;
        System.out.println("Introduce un numero entero \n");
        num=teclado.nextInt();
        
        for (int i=0; i<8; i++){
            System.out.println("Introduce un nuevo numero");
        num2=teclado.nextInt();
        if (num2>num) {System.out.println("Numero mayor que el inincial"+num2);
        acum++;}
        }
        System.out.println("El numero total de numeros mayores es:"+acum);
    }
}
