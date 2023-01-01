package com.fawry.fawrySTS.servise;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fawry.fawrySTS.repository.myServices;
import com.fawry.fawrySTS.model.etisalateCompany;
@Service
public class etisalate extends myServices {

	
	private etisalateCompany Company;
	@Autowired
	public etisalate() throws IOException {
		
		Company.setName("etisalate ");
		this.name =Company.getName();

	}
}
