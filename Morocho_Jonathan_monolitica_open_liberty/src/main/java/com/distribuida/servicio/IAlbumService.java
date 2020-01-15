package com.distribuida.servicio;

import java.util.List;

import com.distribuida.modelo.Album;

public interface IAlbumService {

	List<Album> listarAlbumes();
	
	Album getAlbumById(Integer idAlbum);
	
	Album insertar(Album album);
	
	Album editar(Album album);
	
	void eliminar(Integer idAlbum);
}
