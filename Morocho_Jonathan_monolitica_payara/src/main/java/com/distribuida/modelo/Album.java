package com.distribuida.modelo;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "album")
@Getter
@Setter

public class Album {

	

	@Id
	@Column(name = "idalbum")
	private Integer idAlbum;
	
	@Column(name = "idsinger")
	private Integer idSinger;
	
	@Column(name = "title")
	private String title;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "releasedate")
	private Date releaseDate;
	
	public Album() {
		
	}
}
