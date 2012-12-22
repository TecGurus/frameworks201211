package javagurus.curso.frameworks.controllers;

import javagurus.curso.frameworks.dao.BancoDAO;
import javagurus.curso.frameworks.model.Banco;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.ParentPackage;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import java.util.List;


@ParentPackage(value="struts-default")
@Action(value="bancoAction")
@Results({
	@Result(name="SUCCESS",location="/algo.jsp"),
	@Result(name="NOHAYBANCOS",location="/sinbancos.jsp"),
	@Result(name="LISTABANCOS",location="/listaBancos.jsp")
})
public class BancoAction {
	public Integer id;
	public String nombre;
	public List<Banco> listaDeBancos;
	
	
	private BancoDAO bancoDao = new BancoDAO();
	
	public String execute(){
		return "SUCCESS";
	}
	@Action(value="/banco/crearBanco")
	public String crearBanco(){
		Banco banco = new Banco();
		banco.setNombre(nombre);
		bancoDao.insertar(banco);
		this.setListaDeBancos(bancoDao.listar());
		return "SUCCESS";
	}
	
	@Action(value="listaBancos")
	public String listaBancos(){
		this.setListaDeBancos(bancoDao.listar());
		if(this.listaDeBancos == null)
		{
			return "NOHAYBANCOS";
		}
		return "SUCCESS";
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Banco> getListaDeBancos() {
		return listaDeBancos;
	}
	public void setListaDeBancos(List<Banco> listaDeBancos) {
		this.listaDeBancos = listaDeBancos;
	}	
}
