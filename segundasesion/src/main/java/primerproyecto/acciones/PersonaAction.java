package primerproyecto.acciones;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

@ParentPackage(value="holamundo")
@Action(value="Saluda")
@Results({
	@Result(name="SUCCESS", location="/holamundo/saluda.jsp"),
	@Result(name="FAIL", location="/holamundo/saluda.jsp")
})
public class PersonaAction {
	
	
	private String nombre;

	public String execute(){
		return "SUCCESS";
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}		
}
