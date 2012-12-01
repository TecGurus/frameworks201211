package frameworks.primerasesion.holamundo;

import java.util.Date;

import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

public class Usuario {
	private String nombre;
    private String username;
    private String password;
    private int edad;
    private Date fechaNacimiento;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getUsername() {
		return username;
	}
	
	@RequiredStringValidator(message="La contraseña es un campo obligatorio.")
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
}
