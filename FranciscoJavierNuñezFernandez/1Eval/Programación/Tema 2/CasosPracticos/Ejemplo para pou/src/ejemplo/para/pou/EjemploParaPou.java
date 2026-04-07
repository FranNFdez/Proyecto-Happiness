/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo.para.pou;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
import java.lang.Math;
public class EjemploParaPou {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner  teclado = new Scanner(System.in);
    Double base, exp, resultado;
    
    System.out.println("Introduzca la base");
    base = teclado.nextDouble();
    
    System.out.println("Introduzca el exponente");
    exp = teclado.nextDouble();
    resultado = Math.pow(base, exp);
    System.out.printf("El resultado es %.2f\n",resultado);
    
    if(resultado > 20)
        //resultado = resultado + (resultado*0.1);
        resultado += resultado*0.10;
    System.out.printf("El resultado es %.2f\n",resultado);
    
    else(
        System.out.println("El resultado no ha llegado a x");
    )
                
    








// TODO code application logic here
    }
    
}
