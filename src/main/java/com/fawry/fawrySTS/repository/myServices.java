package com.fawry.fawrySTS.repository;

import org.springframework.stereotype.Repository;

@Repository
public abstract class myServices {
	public String name ;
	public String recharg() {
		return  "bill of charged from "+ name;
	};
	
	public String payInternet() {
		return  "bill of Internet pay from "+ name;
	};
	
}
