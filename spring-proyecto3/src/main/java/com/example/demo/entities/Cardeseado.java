package com.example.demo.entities;



import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="carsdesado")
public class Cardeseado implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	@Column(name="model")
	private String model;
	
	@Column(name="cc")
	private Double cc;
	
	@Column(name="precio")
	private Double precio;
	
	@Column(name="acabado")
	private String acabado;
	
	@Column(name="color")
	private String color;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Cardeseado() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Double getCc() {
		return cc;
	}

	public void setCc(Double cc) {
		this.cc = cc;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public String getAcabado() {
		return acabado;
	}

	public void setAcabado(String acabado) {
		this.acabado = acabado;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Cardeseado( String model, Double cc, Double precio, String acabado, String color, User user) {
		this.model = model;
		this.cc = cc;
		this.precio = precio;
		this.acabado = acabado;
		this.color = color;
		this.user = user;
	}
	
	
	
}
