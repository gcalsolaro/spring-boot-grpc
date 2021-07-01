package com.gcalsolaro.grpc.server.domain.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * The persistent class for the instance database table.
 * 
 */
@Entity
public class Instance implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_instance")
	private Integer idInstance;

	@Column(name = "c_instance")
	private String cInstance;

	private String info;

	// bi-directional many-to-one association to User
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fk_user")
	private User user;

	public Instance() {
	}

	public Integer getIdInstance() {
		return idInstance;
	}

	public void setIdInstance(Integer idInstance) {
		this.idInstance = idInstance;
	}

	public String getcInstance() {
		return cInstance;
	}

	public void setcInstance(String cInstance) {
		this.cInstance = cInstance;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}