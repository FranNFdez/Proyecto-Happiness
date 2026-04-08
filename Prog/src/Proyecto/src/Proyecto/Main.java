package Proyecto;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Scanner;

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
                    menuEventos(sc);
                    break;
                case 3:
                    menuFavoritos(sc);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion no valida");
            }

        } while (opcion != 4);

        sc.close();
    }

    /* SUBMENUS */
    
    /* SUBMENU USUARIOS */
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
    
    /* SUBMENU EVENTOS */
    public static void menuEventos(Scanner sc) {
        int opcion;

        do {
            System.out.println("\n--EVENTOS--");
            System.out.println("1. Añadir evento");
            System.out.println("2. Eliminar evento");
            System.out.println("3. Añadir galeria");
            System.out.println("4. Eliminar galeria");
            System.out.println("5. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    crearEvento(sc);
                    break;
                case 2:
                    eliminarEvento(sc);
                    break;
                case 3:
                    crearGaleria(sc);
                    break;
                case 4:
                    eliminarGaleria(sc);
                    break;
            }

        } while(opcion != 5);
    }

    /* SUBMENU FAVORITOS */
    public static void menuFavoritos(Scanner sc) {
        int opcion;

        do {
            System.out.println("\n--FAVORITOS--");
            System.out.println("1. Añadir favorito");
            System.out.println("2. Eliminar favorito");
            System.out.println("3. Volver");

            opcion = sc.nextInt();
            sc.nextLine();

            switch(opcion) {
                case 1:
                    crearFavorito(sc);
                    break;
                case 2:
                    eliminarFavorito(sc);
                    break;
            }

        } while(opcion != 3);
    }

    /* USUARIOS */

    public static void crearUsuario(Scanner sc){
        System.out.println("Introduzca su nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduzca su email:");
        String email = sc.nextLine();

        String password;
        String confirmarpassword;

        do{
            System.out.println("Introduce su contraseña:");
            password = sc.nextLine();

            System.out.println("Repita su contraseña:");
            confirmarpassword = sc.nextLine();

            if (!password.equals(confirmarpassword)) {
                System.out.println("Las contraseñas no coinciden");
            }

        } while (!password.equals(confirmarpassword));

        if (usuarios.containsKey(email)) {
            System.out.println("El usuario ya existe");
        } else {
            Usuario nuevo = new Usuario(nombre, email, password);
            usuarios.put(email, nuevo);
            System.out.println("Usuario creado correctamente");
        }
    }

    public static void eliminarUsuario(Scanner sc){
        System.out.println("Introduce el email del usuario a eliminar:");
        String email = sc.nextLine();

        if (!usuarios.containsKey(email)) {
            System.out.println("El usuario no existe");
        } else {
            usuarios.remove(email);
            System.out.println("Usuario eliminado correctamente");
        }
    }

    /* EVENTOS */

    public static void crearEvento(Scanner sc) {

        System.out.println("Introduce la fecha (dd/mm/yyyy):");
        String fecha = sc.nextLine();

        System.out.println("Introduce el titulo:");
        String titulo = sc.nextLine();

        System.out.println("Introduce la ubicacion:");
        String ubicacion = sc.nextLine();

        System.out.println("Introduce la descripcion:");
        String descripcion = sc.nextLine();

        System.out.println("Seleccione tipo de evento:");
        System.out.println("1. Motor");
        System.out.println("2. Musica");
        System.out.println("3. Skate");

        int opcionTipo = sc.nextInt();
        sc.nextLine();

        String tipo;

        switch(opcionTipo) {
            case 1:
                tipo = "Motor";
                break;
            case 2:
                tipo = "Musica";
                break;
            case 3:
                tipo = "Skate";
                break;
            default:
                tipo = "Otros";
        }

        contadorEventos++;
        int id = contadorEventos;

        Evento nuevo = new Evento(id, fecha, titulo, ubicacion, descripcion, tipo);
        eventos.put(id, nuevo);

        System.out.println("Evento creado correctamente");
    }
    
    public static void eliminarEvento(Scanner sc) {

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos");
            return;
        }

        System.out.println("Eventos:");
        for (Evento e : eventos.values()) {
            System.out.println(e);
        }

        System.out.println("Introduce el ID del evento:");
        int id = sc.nextInt();
        sc.nextLine();

        if (!eventos.containsKey(id)) {
            System.out.println("El evento no existe");
        } else {
            eventos.remove(id);
            System.out.println("Evento eliminado correctamente");
        }
    }

    /* FAVORITOS */

    public static void crearFavorito(Scanner sc) {

        if (usuarios.isEmpty() || eventos.isEmpty()) {
            System.out.println("Debe haber usuarios y eventos creados");
            return;
        }

        System.out.println("Usuarios:");
        for (Usuario u : usuarios.values()) {
            System.out.println(u);
        }

        System.out.println("Eventos:");
        for (Evento e : eventos.values()) {
            System.out.println(e);
        }

        System.out.println("Introduce el email del usuario:");
        String email = sc.nextLine();

        System.out.println("Introduce el ID del evento:");
        int idEvento = sc.nextInt();
        sc.nextLine();

        if (!usuarios.containsKey(email) || !eventos.containsKey(idEvento)) {
            System.out.println("Datos incorrectos");
        } else {
            Favorito f = new Favorito(email, idEvento);
            favoritos.add(f);
            System.out.println("Favorito creado correctamente");
        }
    }
    
    public static void eliminarFavorito(Scanner sc) {

        if (favoritos.isEmpty()) {
            System.out.println("No hay favoritos");
            return;
        }

        System.out.println("Favoritos:");
        for (Favorito f : favoritos) {
            System.out.println(f);
        }

        System.out.println("Introduce el email:");
        String email = sc.nextLine();

        System.out.println("Introduce el ID del evento:");
        int idEvento = sc.nextInt();
        sc.nextLine();

        Favorito eliminar = null;

        for (Favorito f : favoritos) {
            if (f.getCorreoUsuario().equals(email) && f.getIdEvento() == idEvento) {
                eliminar = f;
            }
        }

        if (eliminar == null) {
            System.out.println("El favorito no existe");
        } else {
            favoritos.remove(eliminar);
            System.out.println("Favorito eliminado correctamente");
        }
    }
    
    /* GALERIAS */
    
    public static void crearGaleria(Scanner sc) {

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos");
            return;
        }

        System.out.println("Eventos:");
        for (Evento e : eventos.values()) {
            System.out.println(e);
        }

        System.out.println("Introduce el ID del evento:");
        int idEvento = sc.nextInt();
        sc.nextLine();

        if (!eventos.containsKey(idEvento)) {
            System.out.println("Evento no existe");
            return;
        }

        System.out.println("Introduce el titulo de la galeria:");
        String titulo = sc.nextLine();

        contadorGalerias++;

        Galeria g = new Galeria(contadorGalerias, titulo, idEvento);

        eventos.get(idEvento).getGalerias().add(g);

        System.out.println("Galeria creada correctamente");
    }
    
    public static void eliminarGaleria(Scanner sc) {

        if (eventos.isEmpty()) {
            System.out.println("No hay eventos");
            return;
        }

        System.out.println("Eventos:");
        for (Evento e : eventos.values()) {
            System.out.println(e);
        }

        System.out.println("Introduce el ID del evento:");
        int idEvento = sc.nextInt();
        sc.nextLine();

        if (!eventos.containsKey(idEvento)) {
            System.out.println("Evento no existe");
            return;
        }

        ArrayList<Galeria> galerias = eventos.get(idEvento).getGalerias();

        if (galerias.isEmpty()) {
            System.out.println("No hay galerias");
            return;
        }

        System.out.println("Galerias:");
        for (Galeria g : galerias) {
            System.out.println(g);
        }

        System.out.println("Introduce el ID de la galeria:");
        int id = sc.nextInt();
        sc.nextLine();

        Galeria eliminar = null;

        for (Galeria g : galerias) {
            if (g.getId() == id) {
                eliminar = g;
            }
        }

        if (eliminar == null) {
            System.out.println("La galeria no existe");
        } else {
            galerias.remove(eliminar);
            System.out.println("Galeria eliminada correctamente");
        }
    }
}