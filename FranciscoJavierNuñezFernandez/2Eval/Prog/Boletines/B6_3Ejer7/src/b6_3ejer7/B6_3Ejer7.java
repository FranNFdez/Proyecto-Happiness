package b6_3ejer7;

/**
 *
 * @author elfra
 */
import java.util.Arrays;
import java.util.Scanner;
public class B6_3Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int v[]= new int [10];
        
        v=cargarArray(v, teclado);
        System.out.println("array-->" + Arrays.toString(v));
        v=OrdenarArray(v);
        System.out.println("array ordenado-->" + Arrays.toString(v));
        v=sinRepetir(v);
        System.out.println("array sin repeticiones-->" + Arrays.toString(v));
    }
    public static int[] cargarArray(int v[], Scanner teclado){
        for (int i=0; i<10; i++){
            System.out.println("Introduce el numero de la posicion");
            v[i]= teclado.nextInt();
            }
        return v;
            }
    public static int[] OrdenarArray(int v[]){
        int dim=10;
        
        for (int i=0;i<9;i++){
            for (int j=i+1; j<9; j++){
            int aux=v[j];
           
            if (v[i]>v[j]){
            v[j]=v[i];
            v[i]=aux;
            }
            }
        }
           return v;}
    public static int[] sinRepetir(int v[]){
    int array[]= new int [10];
        for (int i=0;i<10;i++){
            for (int j=0; j<9-i; j++){
            int aux=v[j];
            if (v[j]!=array[j]){
                array[aux]=v[i];
            }               
            }
        }
    
    return v;
    }
    
    public static int comprobar(int n, Scanner teclado){
    
    while(n<=0){
        System.out.println("El numero no es correcto debe ser mayor que cero");
        n=teclado.nextInt();}
    return n;
    }
}
