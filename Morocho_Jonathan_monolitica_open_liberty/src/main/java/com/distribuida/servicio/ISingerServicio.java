package com.distribuida.servicio;

import java.util.List;

import com.distribuida.modelo.Singer;

public interface ISingerServicio {

	List<Singer> listarTodos();
	
	Singer getSingerById(Integer idSinger);
	
	Singer insertar(Singer singer);
	
	Singer editar(Singer singer);
	
	void eliminar(Integer idSinger);
	
}
