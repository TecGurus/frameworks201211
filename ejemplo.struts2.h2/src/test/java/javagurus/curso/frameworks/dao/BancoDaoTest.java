package javagurus.curso.frameworks.dao;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import javagurus.curso.frameworks.model.Banco;

import org.junit.Test;

public class BancoDaoTest {
	private BancoDAO bancoDAO = new BancoDAO();
	@Test
	public void testInsertar() {
		Banco banco = new Banco();
		banco.setNombre("Banco 11082012");
		int idBanco = bancoDAO.insertar(banco);
		assertTrue(idBanco != -1);
	}

	@Test
	public void testEliminar() {
		Banco banco = new Banco();
		banco.setNombre("Banco 11082012");
		int idBanco = bancoDAO.insertar(banco);
		assertTrue(idBanco != -1);
		boolean eliminado = bancoDAO.eliminar(idBanco);
		assertTrue(eliminado);
	}

	@Test
	public void testActualizar() {
		Banco banco = new Banco();
		banco.setNombre("Banco 11082012");
		int idBanco = bancoDAO.insertar(banco);
		assertTrue(idBanco != -1);
		//Actualizo el banco
		banco.setNombre("Banco Actualizado");
		boolean actualizado = bancoDAO.actualizar(banco);
		assertTrue(actualizado);
		
	}

	@Test
	public void testListar() {
		List<Banco> bancos = bancoDAO.listar();
		assertNotNull(bancos);
		assertTrue(bancos.size() > 0);
		
		for (Banco banco : bancos) {
			System.out.println(banco.getIdbanco());
			System.out.println(banco.getNombre());
		}
	}

	@Test
	public void testBuscarPorId() {
		Banco banco = bancoDAO.buscarPorId(1);
		assertNotNull(banco);
		System.out.println(banco.getIdbanco());
		System.out.println(banco.getNombre());
		
	}

}
