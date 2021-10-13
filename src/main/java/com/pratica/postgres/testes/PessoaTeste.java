package com.pratica.postgres.testes;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.pratica.postgres.models.Pessoa;

public class PessoaTeste {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("banco-postgres");
		EntityManager em = emf.createEntityManager();
		
		Pessoa pessoa = new Pessoa("Helena");
		
		em.getTransaction().begin();
		
		em.persist(pessoa);
		
		em.getTransaction().commit();
		em.close();
		emf.close();

	}
	
}
