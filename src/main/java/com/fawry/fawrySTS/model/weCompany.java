package com.fawry.fawrySTS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class weCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer weId;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
