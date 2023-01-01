package com.fawry.fawrySTS.servise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fawry.fawrySTS.model.user;
import com.fawry.fawrySTS.repository.userRepository;

@Service
public class userServise {

	@Autowired
	private userRepository repo;
	
	public user login(String email, String password) {
		  user user = repo.findByUsernameAndPassword(email, password);
		   return user;
		  }
}
