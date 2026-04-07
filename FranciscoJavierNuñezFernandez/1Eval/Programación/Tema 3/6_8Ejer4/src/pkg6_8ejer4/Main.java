/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg6_8ejer4;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
import java.util.Random;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int opcion;
        boolean rellena = false; 
        do{
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Sumar filas");
            System.out.println("3. Sumar columna");
            System.out.println("4. Sumar diagonal principal");
            System.out.println("5. Sumar diagonal inversa");
            System.out.println("6. Hacer media");
            System.out.println("7. Salir");
            
            opcion = teclado.nextInt();
            switch (opcion){ 
                case 1:
                    for(int i = 0;i < 4; i++){
                    for(int j = 0;j < 4;j++){
                        System.out.println("Introduce numero: ");
                        matriz[i][j] = teclado.nextInt();
                }
            }
                    rellena = true;
                    break;
                    
                case 2:
                    
            }
            while (opcion != 7);
           


            
        }
        
    }
    
}
