package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "t_municipios")
public class Municipio {
	@Id
	@Column(name = "id")
	private Integer idmunicipio;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_depto", referencedColumnName = "id")
	private Departamento departamento;

	@Column(name = "municipio")
	private String municipio;

	public Integer getIdmunicipio() {
		return idmunicipio;
	}

	public void setIdmunicipio(Integer idmunicipio) {
		this.idmunicipio = idmunicipio;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public Municipio(Integer idmunicipio, Departamento departamento, String municipio) {
		super();
		this.idmunicipio = idmunicipio;
		this.departamento = departamento;
		this.municipio = municipio;
	}

	public Municipio() {
		super();
		// TODO Auto-generated constructor stub
	}

}
