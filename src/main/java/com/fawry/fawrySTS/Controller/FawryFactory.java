package com.fawry.fawrySTS.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fawry.fawrySTS.servise.etisalate;
import com.fawry.fawrySTS.servise.orange;
import com.fawry.fawrySTS.servise.vodafone;
import com.fawry.fawrySTS.servise.we;

@RestController
@CrossOrigin(allowedHeaders="*",origins = "*")
public class FawryFactory {

	@Autowired
	private etisalate etisalatService;
	private vodafone vodafoneService;
	private we weService;
	private orange orangeService;
	
	
	@GetMapping("/charge/type")
	public String charge(@RequestParam String type) {
		
		if(type=="etisalate") {
			return etisalatService.recharg();
		}
		if(type== "vodafone"){
			return vodafone.recharg();
			}
		if(type=="we"){
			return we.recharg();
		}
		if(type=="orange"){
			return orange.recharg();
			}
		else return "no entity" ;
	}
	
	@GetMapping("/payInternet/type")
	public String payInternet(@RequestParam String type) {
		
		if(type=="etisalate") {
			return etisalatService.payInternet();
		}
		if(type== "vodafone"){
			return vodafone.payInternet();
			}
		if(type=="we"){
			return we.payInternet();
		}
		if(type=="orange"){
			return orange.payInternet();
			}
		else return "no entity" ;
	}
}




