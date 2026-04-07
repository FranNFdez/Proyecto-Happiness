/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b1_4ejer1;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B1_4Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado = new Scanner (System.in);
    double a,b,sum,rest,div,mul,modulo;
    System.out.printf("Introduce los números que quieras operar: ");
        a=teclado.nextDouble();
        b=teclado.nextDouble();
        sum=a+b;
        rest=a-b;
        div=a/b;
        mul=a*b;
        modulo=a%b;
     System.out.printf("La suma de %.2f y %.2f es :%.2f \n",a,b,sum);
     System.out.printf("La resta de %.2f y %.2f es :%.2f \n",a,b,rest);
     System.out.printf("La división de %.2f y %.2f es :%.2f \n",a,b,div);
     System.out.printf("La multiplicación de %.2f y %.2f es :%.2f \n",a,b,mul);
     System.out.printf("El resto de dividir %.2f entre %.2f es :%.2f \n",a,b,modulo);
    
    
    
    
    
    
    }
    
}
