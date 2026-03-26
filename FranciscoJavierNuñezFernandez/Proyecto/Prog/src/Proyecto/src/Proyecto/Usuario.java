package Proyecto;

public class Usuario {
	private String nombre;
	private String email;
	private String password;
	
	public Usuario(String nombre, String email, String password) {
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEmail() {
		return email;
	}
	public String getEmail() {
		return email;
	}
	public String setNombre(String Nombre) {
		this.nombre = nombre;
	}
	public String getPassword(String Password) {
		this.password = password;
	}
	public String setPassword(String Password) {
		this.nombre = Password;
	}
	
	@Override
	public String toString() {
		return nombre + " - " + email;
	}
}
