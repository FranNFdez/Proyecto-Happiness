/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_ejer5;

/**
 *
 * @author elfra
 */
import java.util.Scanner;
public class B1_Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
    double kmh, ms;
    System.out.println("Bienvenido al trasformador de kilometros por hora a metros por segundo");
    System.out.println("Escriba los km/h que desea trasformar a metros por segundo:");
    kmh=teclado.nextDouble();
    ms=kmh/3.6;
    System.out.printf("Los metros por segundo de %.2f km/h son: %.2f m/s",kmh, ms);

        // TODO code application logic here
    }
    
}
