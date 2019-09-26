package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "t_departamentos")
public class Departamento {
	@Id
	@Column(name = "id")
	private Integer idpais;

	@Column(name = "departamento")
	private String departamento;

	public Integer getIdpais() {
		return idpais;
	}

	public void setIdpais(Integer idpais) {
		this.idpais = idpais;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public Departamento(Integer idpais, String departamento) {
		super();
		this.idpais = idpais;
		this.departamento = departamento;
	}

	public Departamento() {
		super();
		// TODO Auto-generated constructor stub
	}

}
