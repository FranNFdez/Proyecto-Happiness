package Prog;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;;

public class Main {

    static HashMap<String, Usuario> usuarios = new HashMap<>();
    static HashMap<Integer, Evento> eventos = new HashMap<>();
    static ArrayList<Favorito> favoritos = new ArrayList<>();

    static int contadorEventos = 0;
    static int contadorGalerias = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n---MENU---");
            System.out.println("1. Añadir usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Añadir evento");
            System.out.println("4. Eliminar evento");
            System.out.println("5. Añadir galeria");
            System.out.println("6. Eliminar galeria");
            System.out.println("7. Añadir favorito");
            System.out.println("8. Eliminar favorito");
            System.out.println("9. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 9:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("Repita su selección");

            }

        } while (opcion != 9);
        sc.close();
    }
}