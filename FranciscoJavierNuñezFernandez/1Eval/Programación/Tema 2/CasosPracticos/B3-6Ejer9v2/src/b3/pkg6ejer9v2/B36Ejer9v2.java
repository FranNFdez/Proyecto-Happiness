/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3.pkg6ejer9v2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B36Ejer9v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int num = (int) (Math.random() * (10 - 1) + 1);
    System.out.println("Numero Aleatorio =" + num);
    
    imprimircuadrados(num);
    }
    
    public static void imprimircuadrados(int n){
        int cont = 0;
        while (cont < 10){
            if (n % 7 == 0){
                System.printf("&.0f\n", Math.pow(n, 2));
                        cont ++;
            }
        n++;
        }
    }
}
    
        // TODO code application logic here
    
    
}
