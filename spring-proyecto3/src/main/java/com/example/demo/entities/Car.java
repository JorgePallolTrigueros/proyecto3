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
@Table(name="cars")
public class Car implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	@Column(name="id")
	private Long id;
	
	private String model;
	
	private Double cc;
	
	private Double cv;
	
	@Column(name="num_passengers")
	private Integer numPassengers;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private User user;
	
	public Car() {}

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

	public Double getCv() {
		return cv;
	}

	public void setCv(Double cv) {
		this.cv = cv;
	}

	public Integer getNumPassengers() {
		return numPassengers;
	}

	public void setNumPassengers(Integer numPassengers) {
		this.numPassengers = numPassengers;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}


	
	
	

}
