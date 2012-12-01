package primerproyecto.acciones;

import java.util.Map;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionContext;

@ParentPackage(value="default")
@Action(value="pruebaSesion")
@Results({
	@Result(name="SUCCESS", location="/pruebasesion.jsp")
})
public class PruebaSesionAction {
	private Map<String, Object> mapaDeSesion;
	
	public String execute(){
		this.setMapaDeSesion(ActionContext.getContext().getSession());		
		return "SUCCESS";
	}

	public Map<String, Object> getMapaDeSesion() {
		return mapaDeSesion;
	}

	public void setMapaDeSesion(Map<String, Object> mapaDeSesion) {
		this.mapaDeSesion = mapaDeSesion;
	}
	
}
