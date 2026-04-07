/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b3_4ejer5;

/**
 *
 * @author elfra
 */

public class B3_4Ejer5 {
    final static int min=1;
    final static int max=4;
    public static void main(String[] args) {
       
        int random= (int) (Math.random()*(4-1+1)+1);
        
        System.out.println("EL numero aleatorio es: "+ random);
        System.out.println("El calculo final es: "+ producto(random));
    }
    public static int producto(int n) {
    int num;
    if (n%2==0){
    n += 1;
    }
    num=n;
    for (int i=0; i<10; i++){
    n+=2;
    num *=n;}
    return num;
    }
    
}

