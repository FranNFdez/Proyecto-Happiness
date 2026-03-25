package Proyecto;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;

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
        	System.out.println("\n--MENU PRINCIPAL--");
            System.out.println("1. Usuarios");
            System.out.println("2. Eventos");
            System.out.println("3. Favoritos");
            System.out.println("4. Salir");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                	menuUsuarios(sc);
                    break;
                case 2:
                //	menuEventos(sc);
                    break;
                case 3:
                //	menuFavoritos(sc);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    System.out.println("Repita su selección");

            }

        } while (opcion != 4);
        sc.close();
    }
    
    
    /*Creación submenus*/
    public static void menuUsuarios(Scanner sc) {
        int opcion;

        do {
            System.out.println("\n--USUARIOS--");
            System.out.println("1. Añadir usuario");
            System.out.println("2. Eliminar usuario");
            System.out.println("3. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    crearUsuario(sc);
                    break;
                case 2:
                    eliminarUsuario(sc);
                    break;
            }

        } while(opcion != 3);
    }
    
    
    public static void menuEventos(Scanner sc) {
        int opcion;

        do {
            System.out.println("\n--Eventos--");
            System.out.println("1. Añadir evento");
            System.out.println("2. Eliminar evento");
            System.out.println("3. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    crearEvento(sc);
                    break;
                case 2:
                    eliminarEvento(sc);
                    break;
            }

        } while(opcion != 3);
    }
    
    
    public static void menuFavoritos(Scanner sc) {
        int opcion;

        do {
            System.out.println("\n--Favoritos--");
            System.out.println("1. Añadir a favoritos");
            System.out.println("2. Eliminar de favoritos");
            System.out.println("3. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    crearFavoritos(sc);
                    break;
                case 2:
                    eliminarFavoritos(sc);
                    break;
            }

        } while(opcion != 3);
    }
    
    
    /*Creacion usuarios y borrado de usuarios*/
    public static void crearUsuario(Scanner sc){
        System.out.println("Introduzca su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su email:");
        String email = sc.nextLine();

        /*Contraseña y confirmar contraseña*/
        String password;
        String confirmarpassword;
        do{
        System.out.println("Introuzca su contraseña");
        password = sc.nextLine();
        System.out.println("Repita su contraseña");
        confirmarpassword = sc.nextLine();
        if (!password.equals(confirmarpassword)) {
            System.out.println("Las contraseñas no coinciden, inténtelo de nuevo");
        }
        }
        while (!password.equals(confirmarpassword));
        
        /*Comprobar si el usuario existe*/
        if (usuarios.containsKey(email)) {
            System.out.println("El usuario ya existe");
        }
        else{
            Usuario nuevo = new Usuario (nombre, email, password);
            usuarios.put(email, nuevo);
            System.out.println("Usuario creado correctamente");
        }
    }
    public static void eliminarUsuario(Scanner sc){
    	System.out.println("Introduzca el email del usuario que desea eliminar");
    	String email = sc.nextLine();
    
	    /*Comprobar si el usuario existe*/
	    if (!usuarios.containsKey(email)) {
	        System.out.println("El usuario no existe");
	    }
	    else {
	    	usuarios.remove(email);
	    	System.out.println("Usuario eliminado correctamente");
	    }
	}
    
    /*Creación Eventos*/
    public static void crearEvento(Scanner sc) {
    	System.out.printf("Introduzca la fecha del evento:\nEl formato de fecha debe de ser: dd/mm/yyyy");
    	String fecha = sc.nextLine();
    	
    	System.out.println("Introduzca el titulo del evento:");
    	String titulo = sc.nextLine();
    	
    	System.out.println("Introduzca la ubicación del evento:");
    	String ubicacion = sc.nextLine();
    	
    	System.out.println("Introduzca el circuito/lugar donde se realizara el evento:");
    	String circuito = sc.nextLine();
    	
    	System.out.println("Introduzca una breve descripción del evento:");
    	String descripcion = sc.nextLine();
    	
    	contadorEventos++;
    	int id = contadorEventos;
    	Evento nuevo = new Evento(id, fecha, titulo, ubicacion, descripcion);
    	eventos.put(id, nuevo);
    	
        System.out.println("Evento creado correctamente");
	
    	
    	
    	
    }
}