package javagurus.curso.frameworks.model;

public class Banco implements java.io.Serializable {

	private Integer idbanco;
	private String nombre;	

	public Banco() {
	}

	public Banco(Integer idbanco, String nombre) {
		this.idbanco = idbanco;
		this.nombre = nombre;
	}

	public Integer getIdbanco() {
		return this.idbanco;
	}

	public void setIdbanco(Integer idbanco) {
		this.idbanco = idbanco;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
