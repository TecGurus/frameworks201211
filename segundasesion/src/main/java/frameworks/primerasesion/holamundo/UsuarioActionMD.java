package frameworks.primerasesion.holamundo;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

@ParentPackage(value="holamundo")
@Action(value="datosUsuario")
@Results ({
	@Result(name="success", location="/holamundo/datos-usuario.jsp"),
	@Result(name="input", location="/holamundo/datos-usuario.jsp"),
})
public class UsuarioActionMD extends ActionSupport implements ModelDriven<Usuario>
{
    private Usuario usuario = new Usuario();

    public Usuario getModel()
    {
        return usuario;
    }

    
    @Override
    public String execute() throws Exception
    {
        return SUCCESS;
    }
}