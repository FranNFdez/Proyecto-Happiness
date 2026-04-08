package Proyecto;

public class Evento {

    private int id;
    private String fecha;
    private String titulo;
    private String ubicacion;
    private String descripcion;
    private String tipo;

    public Evento(int id, String fecha, String titulo, String ubicacion, String descripcion, String tipo) {
        this.id = id;
        this.fecha = fecha;
        this.titulo = titulo;
        this.ubicacion = ubicacion;
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return id + " - " + titulo + " (" + tipo + ")";
    }
}