package util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenceLanceApsAp2");
	
	public static EntityManager criarEntiyManager( ) {
		return emf.createEntityManager();
	}

}
