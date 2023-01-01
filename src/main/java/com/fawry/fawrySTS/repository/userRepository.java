package com.fawry.fawrySTS.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.fawry.fawrySTS.model.user;

@Repository
public interface userRepository extends CrudRepository<user,Integer>{
	
	user findByUsernameAndPassword(String email, String password);
}
