/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_1ejer3;
import java.util.Scanner;
/**
 *
 * @author elfra
 */
public class B6_1Ejer3 {

    /**
     * @param args the command line arguments
     */
    final static String contraseña="formacion";
    public static void main(String[] args) {
        Scanner teclado=new Scanner (System.in);
         
        String cad1;
        int menu;
        
        System.out.println("Elige en el menú\n");
        System.out.println("(1)Ver si coinciden las Contraseña\n");
        System.out.println("(2)Ver la Longitud\n");
        System.out.println("(3)Introduce una nueva cadena y comparalas\n");
        System.out.println("(4) Salir del programa\n");
        System.out.println("--------------------\n");
        
        do{
        
        System.out.println("Elige en el menú 1,2,3 o 4\n");
        menu=teclado.nextInt();
        menu=Comprobar(menu,teclado);
        teclado.nextLine();
        System.out.println("--------------------\n");
        System.out.println("Introduce una cadena\n");
        System.out.println("--------------------\n");
        cad1=teclado.nextLine();
        
        
        
        
        
        switch(menu){
            case 1:
                Verificar(contraseña, cad1);
            break;
            case 2:
                Medir(cad1);
            break;
            case 3:
                
                Comparar(cad1,teclado);
            break;
            case 4:
                Salir();
        }
        }
        while (menu!=4);
                
    }
    public static void Verificar(String contraseña, String cad1){
            if (cad1.equals(contraseña)){
                System.out.println("--------------------\n");
                    System.out.println("La contraseña y la cadena coinciden");}
                else {System.out.println("La contraseña y la cadena no coinciden");}
            
        };
    public static void Medir(String cad1){
    System.out.println("--------------------\n");
    System.out.println("La longitud de la cadena es:\n");
    System.out.println(cad1.length());
    }
    
    public static void Comparar (String cad1, Scanner teclado){
        String cad2;
        System.out.println("--------------------\n");
        System.out.println("Introduce la segunda cadena");
        cad2=teclado.nextLine();
        System.out.println("--------------------\n");
                if (cad1.length()>cad2.length()){System.out.println("La cadena 1 es más larga que la 2\n");}
                else if (cad1.length()==cad2.length()){System.out.println("Las cadenas son igualeds");}
                else {System.out.println("La cadena 2 es más larga que la 1");}
        System.out.println("--------------------\n");
    }
    
    public static void Salir(){
        
        System.out.println("Esta saliendo del programa");
    }
    public static int Comprobar(int menu, Scanner teclado){
    while (menu<1 || menu>4){
        System.out.println("Numero incorrecto\n");
        System.out.println("introduce un numero del 1 al 5\n");
        menu=teclado.nextInt();
    }
    return menu;
    }
}
