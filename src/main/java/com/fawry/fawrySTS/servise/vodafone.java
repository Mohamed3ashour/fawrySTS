package com.fawry.fawrySTS.servise;

import org.springframework.stereotype.Service;

import com.fawry.fawrySTS.model.vodafoneCompany;
import com.fawry.fawrySTS.repository.myServices;

@Service
public class vodafone extends myServices {

	private vodafoneCompany Company;
	public vodafone() {
		Company.setName("vodafone ");
		this.name =Company.getName();
	}
}
