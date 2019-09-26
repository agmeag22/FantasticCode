package com.uca.capas.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "table_role")
public class Role {
	@Id
	@Column(name = "id_role")
	private Integer idrole;

	@Column(name = "role")
	private String role;

	public Integer getIdrole() {
		return idrole;
	}

	public void setIdrole(Integer idrole) {
		this.idrole = idrole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Role(Integer idrole, String role) {
		super();
		this.idrole = idrole;
		this.role = role;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

}
