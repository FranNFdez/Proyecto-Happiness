package b6_1ejer5;

import java.util.Scanner;

public class B6_1Ejer5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String espacio = " ";
        String cad;
        String nombre, apellido1, apellido2;
        String resp;

        do{
            cad="";
        System.out.println("Introduce el nombre");
        nombre = teclado.nextLine();
        System.out.println("Introduce el primer apellido");
        apellido1 = teclado.nextLine().concat(espacio);
        System.out.println("Introduce el segundo apellido");
        apellido2 = teclado.nextLine().concat(espacio);
        
        if (nombre.length()>=3){
            cad=apellido1.toUpperCase()+apellido2.toUpperCase()+nombre.substring(0, 3).toUpperCase();
            System.out.printf("%s", cad);
        } else {System.out.println("El nombre tiene menos de 3 letras");}
            System.out.println("\nDesea seguir con el programa(Si/No)");
            resp=teclado.nextLine().toLowerCase();
        }
        
        while (resp.equals("si"));
    }

}
