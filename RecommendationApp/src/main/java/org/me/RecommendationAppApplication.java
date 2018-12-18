package org.me;


import org.me.dao.*;
import org.me.entities.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecommendationAppApplication implements CommandLineRunner{
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private SkillRepository skillRepository;

	public static void main(String[] args) {
		
		SpringApplication.run(RecommendationAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		/*User u1= userRepository.save(new User("rabebazuz@gmail.com", "Rabeb", "azouz","rabroub"));
		User u2= userRepository.save(new User("oumeyma@gmail.com", "Oumeyma", "azouz","missou"));
		
		Skill s1 = skillRepository.save(new Skill("Java"));
		Skill s2 = skillRepository.save(new Skill("JavaScript"));*/
				
	}
}
