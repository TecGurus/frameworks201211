package javagurus.curso.frameworks.dao;

import java.util.List;

import javagurus.curso.frameworks.model.Banco;
import javagurus.curso.frameworks.util.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BancoDAO {

	public int insertar(Banco banco) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		// Inicia una transaccion
		Transaction transaccion = session.beginTransaction();
		int idBanco = -1;
		try {
			idBanco = (Integer) session.save(banco); // INSERT INTO BANCO .....
			transaccion.commit();
		} catch (HibernateException he) {
			he.printStackTrace();
			transaccion.rollback();
		} finally {
			session.close();
		}

		return idBanco;
	}

	public boolean eliminar(int idBanco) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaccion = session.beginTransaction();
		try {
			Banco banco = (Banco) session.get(Banco.class, idBanco);
			if (banco != null) {
				session.delete(banco);
			} else {
				System.out.println("No existe el banco");
				return false;
			}
			transaccion.commit();
		} catch (HibernateException e) {
			transaccion.rollback();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	public boolean actualizar(Banco banco) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaccion = session.beginTransaction();
		try {
			Banco bancoEncontrado = (Banco) session.get(Banco.class, banco.getIdbanco());
			if (bancoEncontrado != null) {
				bancoEncontrado.setNombre(banco.getNombre());
				session.update(bancoEncontrado); //UPDATE BANCO SET.....
			} else {
				System.out.println("No existe el banco");
				return false;
			}
			transaccion.commit();
		} catch (HibernateException e) {
			transaccion.rollback();
			return false;
		} finally {
			session.close();
		}
		return true;
	}

	public List<Banco> listar() {
		Session session = HibernateUtil.
							getSessionFactory().
							openSession();
		try {
			//SELECT * FROM banco
			List<Banco> bancos = session.
									createQuery("from Banco").
										list();
			return bancos;
		} catch (HibernateException he) {
			System.out.println("Error : " + he.getMessage());
		} finally {
			session.close();
		}
		return null;
	}

	public Banco buscarPorId(int idBanco) {
		Session session = HibernateUtil.
					getSessionFactory().openSession();
		
		try {
			Banco banco = (Banco) session.get(Banco.class, idBanco);
			return banco;
		} catch (HibernateException he) {
			System.out.println(he.getMessage());
			return null;
		} finally {
			session.close();
		}
	}

}




