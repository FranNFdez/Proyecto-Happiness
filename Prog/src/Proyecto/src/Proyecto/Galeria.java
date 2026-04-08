package Proyecto;

public class Galeria {

    private int id;
    private String titulo;
    private int idEvento;

    public Galeria(int id, String titulo, int idEvento) {
        this.id = id;
        this.titulo = titulo;
        this.idEvento = idEvento;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " - " + titulo;
    }
}