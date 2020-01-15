package com.distribuida.modelo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "singer")
public class Singer implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "idsinger")
	private int idSinger;
	
	@Column(name = "firstname")
	private String firstName;
	
	@Column(name = "lastname")
	private String lastName;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "birthdate")
	private Date birthDate;
	
	public Singer() {
		
	}

	public Singer(int idSinger, String firstName, String lastName, Date birthDate) {
		super();
		this.idSinger = idSinger;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Singer [idSinger=" + idSinger + ", firstName=" + firstName + ", lastName=" + lastName + ", birthDate="
				+ birthDate + "]";
	}
	
	
	
}
