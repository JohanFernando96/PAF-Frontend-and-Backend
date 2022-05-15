package com.Paf.PCM;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Paf.PCM.entity.User;
import com.Paf.PCM.repository.UserRepository;

@SpringBootApplication
public class PowerConsumption1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(PowerConsumption1Application.class, args);
	}

	
	@Autowired
	private UserRepository userRepository;
	@Override
	public void run(String... args) throws Exception {
		/*User user1 = new User("Ramesh","50","50");
		userRepository.save(user1);*/
		
	}

}
