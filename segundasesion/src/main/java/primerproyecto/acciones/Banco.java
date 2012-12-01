package primerproyecto.acciones;

public class Banco {
	private String nombre;
	
	private Cuenta cuentas[];

	public Cuenta[] getCuentas() {
		return cuentas;
	}

	public void setCuentas(Cuenta[] cuentas) {
		this.cuentas = cuentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Override
	public String toString(){
		return "Nombre del banco: " +nombre;
	}
	
}
