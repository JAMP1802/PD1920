package com.distribuida.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import com.distribuida.modelo.Singer;

@ApplicationScoped
public class SingerServicioImpl implements ISingerServicio {
	
	@Inject EntityManager manager;

	@Override
	public List<Singer> listarTodos() {
		List<Singer> singers = new ArrayList<>();
		singers = manager.createQuery("FROM Singer", Singer.class).getResultList();
		return singers;
	}

	@Override
	public Singer getSingerById(Integer idSinger) {
		Singer singer = manager.find(Singer.class, idSinger);
		return singer;
	}

	@Override
	@Transactional
	public Singer insertar(Singer singer) {
		manager.getTransaction().begin();
		manager.persist(singer);
		manager.getTransaction().commit();
		return singer;

	}

	@Override
	@Transactional
	public Singer editar(Singer singer) {
		manager.getTransaction().begin();
		manager.merge(singer);
		manager.getTransaction().commit();
		return singer;

	}

	@Override
	@Transactional
	public void eliminar(Integer idSinger) {
		manager.getTransaction().begin();
		Singer singer = manager.find(Singer.class, idSinger);
		manager.remove(singer);
		manager.getTransaction().commit();			
	}

}
