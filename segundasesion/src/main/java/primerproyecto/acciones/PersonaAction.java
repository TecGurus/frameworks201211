package primerproyecto.acciones;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;

@ParentPackage(value="holamundo")
@Action(value="Saluda")
@Results({
	@Result(name="SUCCESS", location="/holamundo/saluda.jsp"),
	@Result(name="FAIL", location="/holamundo/saluda2.jsp")
})
public class PersonaAction {
	
	
	private String nombre;
	
	private Integer edad;
	
	private String bancos[];
	
	private Boolean soltero;
	
	private Cuenta cuenta;

	public String execute(){
		Map<String, Object> mapa = new HashMap<String, Object>();
		mapa.put("valido", false);		
		
		ActionContext.getContext().setSession(mapa);
		
		Map<String, Object> session = ActionContext.getContext().getSession();
		
		Boolean valor = (Boolean) session.get("valido");
		
		
		cuenta = new Cuenta();
			
		
		Banco banco = new Banco();
		banco.setNombre("Banamex");
		banco.setCuentas(new Cuenta[]{new Cuenta(100.00), new Cuenta(20.0),cuenta});
		
		cuenta.setBanco(banco);
		
		System.out.println("Variable nombre" + nombre);
		this.setNombre("nombre");
		System.out.println("Variable nombred" + nombre);
		if(soltero){
			return "FAIL";
		}
		return "SUCCESS";
		
	}
	
	public Cuenta getCuenta() {
		return cuenta;
	}



	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String[] getBancos() {
		return bancos;
	}

	public void setBancos(String[] bancos) {
		this.bancos = bancos;
	}

	public Boolean getSoltero() {
		return soltero;
	}

	public void setSoltero(Boolean soltero) {
		this.soltero = soltero;
	}		
	
	
}
