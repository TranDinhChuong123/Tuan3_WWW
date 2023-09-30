package tuan2.edu.repositories;

import jakarta.persistence.TypedQuery;
import tuan2.edu.db.Connection;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class GenericCRUD<T> {
	EntityManager em;

	public GenericCRUD() {
		EntityManagerFactory emf = Connection.getIntance().getEmf();
		em = emf.createEntityManager();

	}

	// Thực hiện các thao tác Create, Update, Delete, Find by Id, Get All trên từng
	// đối tượng.
	public boolean add(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.persist(t);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return false;

	}
	public T findOfId(Long id,Class<T> clazz) {
		EntityTransaction tr = em.getTransaction();	
		try {
			tr.begin();
			T t = em.find(clazz, id) ;
			tr.commit();
			return t;
		}catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return null;
	}
	public boolean deleteOfId(Long id,Class<T> clazz) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			T t = em.find(clazz, id) ;
			if(t!=null)
				em.remove(t);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public boolean update(T t) {
		EntityTransaction tr = em.getTransaction();
		try {
			tr.begin();
			em.merge(t);
			tr.commit();
			return true;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return false;
	}

	public List<T> getAllObject(Class<T> clazz) {
		EntityTransaction tr = em.getTransaction();

		try {
			tr.begin();
			List<T> list = em.createQuery("from " + clazz.getName(), clazz)
								.getResultList();
			tr.commit();
			return list;
		} catch (Exception e) {
			tr.rollback();
			e.printStackTrace();
		}
		return null;
	}


}
