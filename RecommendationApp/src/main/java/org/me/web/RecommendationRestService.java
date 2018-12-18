package org.me.web;

import java.util.List;

import org.me.dao.SkillRepository;
import org.me.dao.UserRepository;
import org.me.entities.Skill;
import org.me.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecommendationRestService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private SkillRepository skillRepository;
	
	@RequestMapping(value="/user/{userId}", method=RequestMethod.GET)
	public User consultUser(@PathVariable Long userId) {
		return userRepository.findById(userId).orElse(null);
	}
	
	
	@RequestMapping(value="/skills", method=RequestMethod.GET)
	public List<Skill> ListAllSkills(){
		
		return skillRepository.findAll();
	}
	
	@RequestMapping(value="/Myskills", method=RequestMethod.GET)
	public Page<Skill> listeSkills(@RequestParam(name="userId",defaultValue="2")Long userId, 
			@RequestParam(name="page",defaultValue="0")int page,
			@RequestParam(name="size",defaultValue="5")int size) {
		
		return skillRepository.listeSkills( userId ,new PageRequest(page, size));
	}

	
	@RequestMapping(value="/skills/{id}", method=RequestMethod.GET)
	public Skill FindSkill(@PathVariable Long id){
		
		return skillRepository.findById(id).orElse(null);
	}
	
	@RequestMapping(value="/skills", method=RequestMethod.POST)
	public Skill AddSkill(@RequestBody Skill s){
		
		return skillRepository.save(s);
	}
	

	@RequestMapping(value="/skills/{id}", method=RequestMethod.DELETE)
	public boolean DeleteSkill(@PathVariable Long id){
		
		skillRepository.deleteById(id);
		return true;
	}
}
