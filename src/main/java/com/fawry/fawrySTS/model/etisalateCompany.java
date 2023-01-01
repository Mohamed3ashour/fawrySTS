package com.fawry.fawrySTS.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class etisalateCompany {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer etisalatId;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
