package proyectohappiness;

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
            }

        } while (opcion != 4);

        sc.close();
    }

    /* USUARIOS */

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

    public static void crearUsuario(Scanner sc) {
        System.out.println("Nombre:");
        String nombre = sc.nextLine();

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("Password:");
        String password = sc.nextLine();

        if (usuarios.containsKey(email)) {
            System.out.println("El usuario ya existe");
        } else {
            usuarios.put(email, new Usuario(nombre, email, password));
            System.out.println("Usuario creado correctamente");
        }
    }

    public static void eliminarUsuario(Scanner sc) {
        System.out.println("Email:");
        String email = sc.nextLine();

        if (!usuarios.containsKey(email)) {
            System.out.println("No existe");
        } else {
            usuarios.remove(email);
            System.out.println("Eliminado");
        }
    }

    /* EVENTOS */

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

    public static void crearEvento(Scanner sc) {

        System.out.println("Fecha:");
        String fecha = sc.nextLine();

        System.out.println("Titulo:");
        String titulo = sc.nextLine();

        System.out.println("Ubicacion:");
        String ubicacion = sc.nextLine();

        System.out.println("Descripcion:");
        String descripcion = sc.nextLine();

        contadorEventos++;

        eventos.put(contadorEventos,
                new Evento(contadorEventos, fecha, titulo, ubicacion, descripcion, "General"));

        System.out.println("Evento creado");
    }

    public static void eliminarEvento(Scanner sc) {

        for (Evento e : eventos.values()) {
            System.out.println(e);
        }

        System.out.println("ID:");
        int id = sc.nextInt();
        sc.nextLine();

        eventos.remove(id);
        System.out.println("Evento eliminado");
    }

    /* GALERIAS */

    public static void crearGaleria(Scanner sc) {

        for (Evento e : eventos.values()) {
            System.out.println(e);
        }

        System.out.println("ID evento:");
        int idEvento = sc.nextInt();
        sc.nextLine();

        System.out.println("Titulo:");
        String titulo = sc.nextLine();

        contadorGalerias++;

        Galeria g = new Galeria(contadorGalerias, titulo, idEvento);

        eventos.get(idEvento).getGalerias().add(g);

        System.out.println("Galeria creada");
    }

    public static void eliminarGaleria(Scanner sc) {

        System.out.println("ID evento:");
        int idEvento = sc.nextInt();
        sc.nextLine();

        ArrayList<Galeria> lista = eventos.get(idEvento).getGalerias();

        for (Galeria g : lista) {
            System.out.println(g);
        }

        System.out.println("ID galeria:");
        int id = sc.nextInt();
        sc.nextLine();

        Galeria borrar = null;

        for (Galeria g : lista) {
            if (g.getId() == id) {
                borrar = g;
            }
        }

        lista.remove(borrar);

        System.out.println("Galeria eliminada");
    }

    /* FAVORITOS*/

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

    public static void crearFavorito(Scanner sc) {

        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("ID evento:");
        int id = sc.nextInt();
        sc.nextLine();

        favoritos.add(new Favorito(email, id));

        System.out.println("Favorito creado");
    }

    public static void eliminarFavorito(Scanner sc) {

        for (Favorito f : favoritos) {
            System.out.println(f);
        }
        System.out.println("Email:");
        String email = sc.nextLine();

        System.out.println("ID:");
        int id = sc.nextInt();
        sc.nextLine();

        Favorito borrar = null;
        for (Favorito f : favoritos) {
            if (f.getCorreoUsuario().equals(email) && f.getIdEvento() == id) {
                borrar = f;
            }
        }
        favoritos.remove(borrar);
        System.out.println("Favorito eliminado");
    }
}