package br.com.bb.sistemabancario.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;

import br.com.bb.sistemabancario.model.ContaCorrente;

public class ContaCorrenteDAO {
//	private Connection connection;
	
	public void insere(ContaCorrente cc) {
		EntityManagerFactory factory= Persistence.createEntityManagerFactory("sistemabancariohibernate");
		EntityManager manager= factory.createEntityManager();
		try{
			manager.getTransaction().begin();
			manager.persist(cc);
			manager.getTransaction().commit();
		} 
		finally{
			if(manager.getTransaction().isActive())
				manager.getTransaction().rollback();
		}manager.close();
	}
	
	public void listAll() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sistemabancariohibernate");
		EntityManager manager = factory.createEntityManager();
		@SuppressWarnings("unchecked")
		List<ContaCorrente> ccs = manager.createQuery("select cc from ContaCorrente cc").getResultList();
		manager.close();
		for(int i=0;i<ccs.size();i++) {
			System.out.println("----------------CONTA "+i+" ----------------");
			ccs.get(i).imprimeContaCorrente();
		}
	}
	
	
}

