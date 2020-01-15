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

import com.distribuida.modelo.Singer;
import com.distribuida.servicio.ISingerServicio;

@Path("/singers")
public class SingerRest {

	@Inject ISingerServicio singerService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Singer> listarTodos() {
		List<Singer> singers = singerService.listarTodos();
		return singers;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{idSinger}")
	public Singer getSinger(@PathParam("idSinger") Integer idSinger) {
		Singer sing = singerService.getSingerById(idSinger);
		return sing;
	}
	
	@POST
	
	public Singer crear(Singer singer) {
		Singer sing = singerService.insertar(singer);
		return sing;
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Singer editar(Singer singer) {
		Singer sing = singerService.editar(singer);
		return sing;
	}
	
	@DELETE
	@Path("/{idSinger}")
	public void eliminar(@PathParam("idSinger") Integer idSinger) {
		singerService.eliminar(idSinger);
	}
}
