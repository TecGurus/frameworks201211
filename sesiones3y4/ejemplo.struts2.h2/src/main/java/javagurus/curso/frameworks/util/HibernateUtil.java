package javagurus.curso.frameworks.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static final SessionFactory sessionFactory;
	/**
	 * Inicializa la fabrica de sesiones de hibernate
	 */
	static {
		sessionFactory = new Configuration().
								configure().
									buildSessionFactory();
	}
	/**
	 * Regresa la fabrica de sesiones.
	 * @return Fabrica de sesiones.
	 */
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
