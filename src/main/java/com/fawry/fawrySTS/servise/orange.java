package com.fawry.fawrySTS.servise;

import org.springframework.stereotype.Service;

import com.fawry.fawrySTS.model.orangeCompany;
import com.fawry.fawrySTS.repository.myServices;

@Service
public class orange extends myServices {

	private orangeCompany Company;
	public orange() {
		Company.setName("Orange ");
		this.name =Company.getName();
	}
}
