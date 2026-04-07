package b6_7ejer3;

import java.util.Scanner;

public class B6_7Ejer3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int[] alturas;
        
        int dim;
        double media;

        System.out.println("Cuantas alturas son?");
        dim = teclado.nextInt();
        alturas = new int[dim];
        
        
        
        cargarDatos(alturas, dim, teclado);
        mostrar(alturas, dim);
        media = CalcularMedia(alturas, dim);
        System.out.printf("La media registrada es %.2f \n", media);
        System.out.printf("El número de alturas mayores que la media son %d\n", superiorMedia(dim,alturas,media));
        System.out.printf("El número de alturas menores que la media son %d\n", inferiorMedia(dim,alturas,media));
        cargarMayorDosMetros(dim, alturas);
        
    }

    public static void cargarDatos(int[] alturas, int dim, Scanner teclado) {
        for (int i = 0; i < dim; i++) {
            System.out.println("Introduce una altura");
            alturas[i] = teclado.nextInt();
        }
    }

    public static void mostrar(int[] alturas, int dim) {
        for (int i = 0; i < dim; i++) {
            System.out.printf("%d\t", alturas[i]);
        }
        System.out.println("");
    }

    public static double CalcularMedia(int[] alturas, int dim) {

        int suma = 0;

        for (int i = 0; i < dim; i++) {
            suma += alturas[i];
        }
        return (double) suma / dim;
    }

    public static int superiorMedia(int dim, int[] alturas, double media) {
        int mayores = 0;
        for (int i = 0; i < dim; i++) {
            if (alturas[i] > media) {
                mayores++;
            }
        }
        return mayores;
    }
    
    public static int inferiorMedia(int dim, int[] alturas, double media) {
        int menores = 0;
        for (int i = 0; i < dim; i++) {
            if (alturas[i] < media) {
                menores++;
            }
        }
        return menores;
    }
    public static void cargarMayorDosMetros(int dim, int[] alturas){
       
       int j=0;
       int[] gigante= new int[dim];
       for(int i=0; i<dim;i++){
            
            if (alturas[i]>200){
             gigante[j]=alturas[i]; 
             j++;}
        }
       mostrar(gigante,j);
        }
    
    }



