/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_6ejer4;
import java.util.Scanner;
/**
 *
 * @author elfra
 */
public class B3_6Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner teclado= new Scanner (System.in);
   int num, num2;
        System.out.println("Introduce el primero numero");
        num=teclado.nextInt();
        System.out.println("Introduce el segundo numero");
        num2=teclado.nextInt();
        System.out.println(Multiplicar(num,num2));
    }
       
    public static int Multiplicar(int num, int num2){
    int num3 = 0;
        for (int i=0; i<num2; i++){
             
    num3+=num;
        }
        return num3;
    }
}
    
         
    
  
    

