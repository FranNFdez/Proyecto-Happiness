/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b6_8ejer4;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class B6_8Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][]matriz = new int[4][4];
        int opcion;
        do{
            System.out.println("1. Rellenar matriz");
            System.out.println("2. Sumar fila");
            System.out.println("3. Sumar columna");
            System.out.println("4. Media de la matriz");
            System.out.println("0. Salir");
            opcion = teclado.nextInt();
            
            switch (opcion){
                case 1:
                    for(int i = 0;i < 4; i++){
                        for(int j = 0;j < 4;j++){}}
        }        
        }
    }
    
}
