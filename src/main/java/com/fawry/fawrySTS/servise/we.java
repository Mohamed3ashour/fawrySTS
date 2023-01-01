package com.fawry.fawrySTS.servise;

import org.springframework.stereotype.Service;

import com.fawry.fawrySTS.model.weCompany;
import com.fawry.fawrySTS.repository.myServices;

@Service
public class we extends myServices {

	private weCompany Company;
	public we() {
		Company.setName("we ");
		this.name =Company.getName();
	}
}
