/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpr5;

/**
 *
 * @author ALUMNOS-FP
 */
public class Cpr5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int y=10, s, x=5;
    double d=3.14;
    char car= 's';
    char car2= 65;
    boolean encontrado=true;
    String saludo="Buenos días";
        
    System.out.println("y= "+y);
    System.out.println("d= "+d);
    System.out.println("car= "+car);
    System.out.println("car2= "+car2);
    System.out.println("encontrado es igual a "+encontrado);
    System.out.println("Saludo es igual a "+saludo);
    
    s=x+y;
    System.out.printf("La operacion realizada: \n %d + %d = %d\n",y,x,s);
    x+=y;
    System.out.printf("La operacion dice qué: \n x = %d",x);
    x+=y;
    System.out.printf("La operacion dice qué: \n x = %d",x);
    }
    
}
