package primerproyecto.acciones;

public class Cuenta {
	private Double saldo;
	private Banco banco;

	public Cuenta(){}
	
	
	public Cuenta(Double saldo) {
		super();
		this.saldo = saldo;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString(){
		return "Esta cuenta tiene: $" + saldo;
	}
	
	

}
