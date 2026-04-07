/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_1ejer4;
import java.util.Scanner;
/**
 *
 * @author elfra
 */
public class B6_1Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String cad1,cad2;
        
        System.out.println("Introduce la cad1");
        cad1=teclado.nextLine();
        
        System.out.println("Introduce la cad2");
        cad2=teclado.nextLine();
        
        System.out.println("Elige en el menu");
        System.out.println("(1) Sustituir cad2 por cad1");
        System.out.println("(2) Pasar a mayusculas");
        System.out.println("(3) Ver longitud de cadenas");
        System.out.println("(4) Salir del programa");
        
         int menu;
        
        
        do{
        
        System.out.println("Elige en el menú 1,2,3 o 4\n");
        menu=teclado.nextInt();
        switch(menu){
            case 1:
                Sobreescrivir(cad1,cad2);
                System.out.println(cad1);
            break;
            case 2:
                Mayus(cad2);
            break;
            case 3:
                
                Cantidad(cad1,cad2);
            break;
            case 4:
                System.out.println("Saliendo del programa");            
        }
        }
        while (menu!=4);
    }
    public static void Sobreescrivir(String cad1, String cad2){
    cad1=cad2;
    }
    public static void Mayus(String cad2){
        System.out.printf("%S", cad2);
    }
    public static void Cantidad(String cad1, String cad2){
    System.out.println("--------------------\n");
    System.out.println("La longitud de la cadena es:\n");
    System.out.println(cad1.length());
        System.out.println("LA longitud de la segunda cadena es:\n");
        System.out.println(cad2.length());
    
    }  
}
