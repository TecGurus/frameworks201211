package frameworks.primerasesion.holamundo;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;

@ParentPackage(value="holamundo")
@Action(value="Saluda")
@Results({
	@Result(name="SUCCESS",location="/holamundo/saludos.jsp")
})
public class PersonaAction {
	
	public String nombre;

	public String execute(){
//		Map<String, Object> mapa = new HashMap<String, Object>();
//		mapa.put("nombre2", "pepe");
//		
//		ActionContext.getContext().setSession(mapa);
//		
//		Map<String, Object> session = ActionContext.getContext().getSession();
//		nombre = (String) session.get("nombre2");
		return "SUCCESS";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
