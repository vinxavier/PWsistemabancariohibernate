package br.com.bb.sistemabancario.dao;

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
}

