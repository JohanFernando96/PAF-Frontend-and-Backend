package com.Paf.PCM.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Paf.PCM.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
