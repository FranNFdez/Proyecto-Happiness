/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b2_4ejer2;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B2_4Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner teclado=new Scanner(System.in);
    ArreglosPantalones ap1;
    double largo,cintura,cantidad;
    int resp;
    String r;
    char ini;
    
        System.out.println("\nDesea un pantalón de talla unica(1) o uno a medida(cualquier otro numero)");
        resp=teclado.nextInt();
             teclado.nextLine();
        if(resp==1){
            ap1 = new ArreglosPantalones();
        }
        else{
            System.out.println("\n¿Cuál es el largo del pantalón?");
            largo=teclado.nextDouble();
            
            System.out.println("\n¿Cuánta cintura?");
            cintura=teclado.nextDouble();
            
            ap1 = new ArreglosPantalones(largo,cintura);    
        }
        
        System.out.println("\n¿Desea cortar el pantalón?(s/n)");
        teclado.nextLine();
        r=teclado.nextLine().toLowerCase(); //.toLowerCase() para que lo pase directamente a minúscula
        ini = r.charAt(0);
              
        
        if (ini=='s'){
            System.out.println("\n¿Cuánto lo quiere cortar?");
            cantidad=teclado.nextDouble();
                    teclado.nextLine();
                           
            
            System.out.printf("\nEl pantalón ha sido cortado y ahora tiene de cintura %.2f y de largo %.2f",ap1.getCintura(),ap1.cortarLargo(cantidad));
        }
        else{
            System.out.printf("\nEl pantalón tiene de cintura %.2f y de largo %.2f",ap1.getCintura(),ap1.getLargo());
        }
        System.out.println("\n¿Desea actualizar el ancho de su cintura?(s/n)");
        r=teclado.nextLine().toLowerCase();
        ini = r.charAt(0);
        
        if (ini=='s'){
            System.out.println("\n¿Que ancho quiere que sea ahora el de su cintura?");
            cantidad=teclado.nextDouble();
            ap1.setCintura(cantidad);
        }   
        System.out.printf("\nLas medidas son de cintura %.2f y de largo %.2f\n",ap1.getCintura(),ap1.getLargo());
        
        
            
        
    }
    
}
