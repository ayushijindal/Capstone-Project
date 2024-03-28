package com.cisco.health.entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	
	@OneToMany(mappedBy="category", cascade = CascadeType.ALL)
	private List<Medicine>medicines;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Medicine> getMedicines() {
		return medicines;
	}


	public void setMedicines(List<Medicine> medicines) {
		this.medicines = medicines;
	}
	
	
	
	
} 
