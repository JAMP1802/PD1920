package com.distribuida.entityproduces;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@ApplicationScoped
public class EntityManagerProduce {

	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Persistencia");
	
	@Produces
	public EntityManager manager() {
		EntityManager em = emf.createEntityManager();
		return em;
	}
	
	
}
