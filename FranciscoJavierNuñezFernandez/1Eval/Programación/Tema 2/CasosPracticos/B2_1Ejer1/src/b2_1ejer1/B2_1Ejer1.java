/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_1ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_1Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner (System.in);
    int resp1;
    double temp,cant;
    
        System.out.println("Que conversión deseas hacer?\n(1)F - C\n(2)C - F");
        resp1=teclado.nextInt();
        
        System.out.println("Que cantidad?");
        cant=teclado.nextDouble();
    
        Temperatura temperatura = new Temperatura();
        
        switch (resp1){
            case 1: //F - C
                temp = temperatura.FarenheitToCelsius(cant);
                System.out.printf("%.2fº F son %.2fº C\n", cant, temp);
                break;
                case 2: //C - F
                temp = temperatura.celsiusToFarenheit(cant);
                System.out.printf("%.2fº C son %.2fº F\n", cant, temp);
                break;
                default:
                    System.out.println("Opción inválida.");
        }
    
    }
    
}
