package com.distribuida.payara;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.distribuida.modelo.Album;
import com.distribuida.servicio.IAlbumService;

@Path("/albumes")
public class AlbumRest {
	
	@Inject IAlbumService albumService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Album> listarTodos(){
		List<Album> albumes = albumService.listarAlbumes();
		return albumes;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idAlbum}")
	public Album getAlbum(@PathParam("idAlbum") Integer idAlbum) {
		Album album = albumService.getAlbumById(idAlbum);
		return album;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Album crear(Album album) {
		Album albumAux = albumService.insertar(album);
		return albumAux;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Album editar(Album album) {
		Album albumAux = albumService.editar(album);
		return albumAux;
	}
	
	@DELETE
	@Path("/{idAlbum}")
	public void eliminar(@PathParam("idAlbum") Integer idAlbum) {
		albumService.eliminar(idAlbum);
	}
}
