/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package franciscot1rec;

/**
 *
 * @author ALUMNOS-FP
 */
import java.util.Scanner;
public class FranciscoT1Rec {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String Nombre,PrimerApellido, SegundoApellido, Escuderia;
    int puntos, temporada, clasificacion;
    System.out.println("¿Cual es el nombre del piloto?");
    Nombre = teclado.nextLine();
    System.out.println("¿Cual es el primer apellido del piloto?");
    PrimerApellido = teclado.nextLine();
    System.out.println("¿Cual es el segundo apellido del piloto?");
    SegundoApellido = teclado.nextLine();
    System.out.println("¿Cual es el nombre de la escuderia del piloto?");
    Escuderia = teclado.nextLine();
    System.out.println("¿Cual es el año de la temporada?");
    temporada = teclado.nextInt();
    System.out.println("¿Cuantos puntos tiene el piloto?");
    puntos = teclado.nextInt();
    System.out.println("¿Cual fue su clasificacion en la carrera?");
    clasificacion = teclado.nextInt();    
    
    if(clasificacion <= 10){
        puntos = puntos + 1;
        System.out.printf("Nombre: %S \n",Nombre);
        System.out.printf("Apellidos: %s %s\n",PrimerApellido, SegundoApellido);
        System.out.printf("Escuderia: %s \n",Escuderia);
        System.out.printf("Temporada: %d \n",temporada);
        System.out.printf("Clasificacion en carrera: %d \n",clasificacion);
        System.out.printf("Su bonificacion es de 1, Su puntuacion actual sigue siendo de: %d\n",puntos );
    }
    else{
        puntos = puntos;
        System.out.printf("Nombre: %S \n",Nombre);
        System.out.printf("Apellidos: %s %s\n",PrimerApellido, SegundoApellido);
        System.out.printf("Escuderia: %s \n",Escuderia);
        System.out.printf("Temporada: %d \n",temporada);
        System.out.printf("Clasificacion en carrera: %d \n",clasificacion);
        System.out.printf("Su bonificacion es de 0, Su puntuacion actual sigue siendo de: %d\n",puntos );
    }
   








// TODO code application logic here
    }
    
}
