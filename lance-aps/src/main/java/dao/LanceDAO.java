package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import entidade.Lance;
import util.JPAUtil;

public class LanceDAO {
	public static void salvar (Lance la) {
		EntityManager em = JPAUtil.criarEntiyManager();
		em.getTransaction().begin();
		em.persist(la);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public static List<Lance> selectAllLance(){
		EntityManager em = JPAUtil.criarEntiyManager();
		Query query = em.createQuery("select lance from Lance lance");
		List<Lance> list = query.getResultList();
		return list;
	}
	
	public static void updateLanceById(Lance la) {
		EntityManager em = JPAUtil.criarEntiyManager();
		em.getTransaction().begin();
		em.merge(la);
		em.getTransaction().commit();
		em.close();
	}
	
	public static void deleteLanceById(Lance la) {
		EntityManager em = JPAUtil.criarEntiyManager();
		em.getTransaction().begin();
		la = em.find(Lance.class, la.getId());
		em.remove(la);
		em.getTransaction().commit();
		em.close();
	}
	
	@SuppressWarnings("unchecked")
	public static Integer countLance() {
		EntityManager em = JPAUtil.criarEntiyManager();
		em.getTransaction().begin();
		Query query = em.createQuery("select lance from Lance lance");
		List<Lance> result = query.getResultList();
		int countList = result.size();
		em.close();
		return countList;
	}
	public static Lance selectLanceById(Integer Id) {
		EntityManager em = JPAUtil.criarEntiyManager();
		Lance la = em.find(Lance.class, Id);
		em.close();
		return la;
	}

	public static List<Lance> listar() {
		EntityManager em = JPAUtil.criarEntiyManager();
		Query q = em.createQuery("select lance from Lance lance");
		List<Lance> lance = q.getResultList();
		em.close();
		return lance;
	}

}
