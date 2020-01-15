package com.distribuida.servicio;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.distribuida.modelo.Album;

public class AlbumServiceImpl implements IAlbumService {

	@Inject EntityManager manager;
	
	@Override
	public List<Album> listarAlbumes() {
		List<Album> albumes = new ArrayList<>();
		albumes = manager.createQuery("FROM Album", Album.class).getResultList();
		return albumes;
	}

	@Override
	public Album getAlbumById(Integer idAlbum) {
		Album album = manager.find(Album.class, idAlbum);
		return album;
	}

	@Override
	public Album insertar(Album album) {
		manager.getTransaction().begin();
		manager.persist(album);
		manager.getTransaction().commit();
		return album;
	}

	@Override
	public Album editar(Album album) {
		manager.getTransaction().begin();
		manager.merge(album);
		manager.getTransaction().commit();
		return album;
	}

	@Override
	public void eliminar(Integer idAlbum) {
		manager.getTransaction().begin();
		Album album = manager.find(Album.class, idAlbum);
		manager.remove(album);
		manager.getTransaction().commit();
	}

}
