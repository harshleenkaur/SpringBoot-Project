package com.niittech.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student_entity")
public class Model {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long Id;

	public Long getId() {
		return Id;
	}
                                                                                           
	public void setId(Long id) {
		Id = id;
	}

	@Column(name = "name")
	private String name;         

	public String getName() {
		return name;
	
	}
	public void setName(String name) {
		this.name = name;
	}
}
