package B6_6Ejer6;

import java.util.Scanner;
public class B6_6Ejer6 {
 
    public static void main(String[] args) {
        /*se desea reakizar un programa que lea 
        15 números por teclado.¡, 
        10 los almacenará en un array y 5 en otro. 
        Mostrar los 15 por pantalla desde 1*/
    Scanner teclado= new Scanner(System.in);
    int [] array = new int [10];
    int [] array2 = new int [5];
 
    for (int i=0;i<10;i++){
            System.out.print("Introduce número " + (i + 1) + ": ");        
            array[i] = teclado.nextInt();
    }
    for (int i=0;i<5;i++){
        System.out.print("Introduce número " + (i + 1) + ": ");        
        array2[i] = teclado.nextInt();
    }
   // Crear el array unido de 15 números
int []array3= new int [15];
 
// Copiar los 10 primeros
for (int i = 0; i < 10; i++) {
    array3[i] = array[i];
}
 
// Copiar los 5 últimos
for (int i = 0; i < 5; i++) {
    array3[10 + i] = array2[i];
}
 
// Mostrar el array unido
System.out.println("\nArray unido:");
for (int i = 0; i < 15; i++) {
    System.out.println("Posición " + (i + 1) + ": " + array3[i]);
}
 
    }
    }