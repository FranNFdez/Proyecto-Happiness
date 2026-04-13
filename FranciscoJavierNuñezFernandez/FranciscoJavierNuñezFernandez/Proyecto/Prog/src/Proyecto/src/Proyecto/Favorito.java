package Proyecto;

public class Favorito {

    private String correoUsuario;
    private int idEvento;

    public Favorito(String correoUsuario, int idEvento) {
        this.correoUsuario = correoUsuario;
        this.idEvento = idEvento;
    }

    public String getCorreoUsuario() {
        return correoUsuario;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setCorreoUsuario(String correoUsuario) {
        this.correoUsuario = correoUsuario;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    @Override
    public String toString() {
        return correoUsuario + " - Evento ID: " + idEvento;
    }
}