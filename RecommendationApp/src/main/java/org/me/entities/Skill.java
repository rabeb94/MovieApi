package org.me.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Skill implements Serializable{
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long skillId ;
	private String name;
	@ManyToOne
	@JoinColumn(name="CODE_USER")//nommer la clé etrangère (si on ne fait pas ça la clé etrangére va etre nommée par défaut client)
	private User user;
	public Skill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Skill(Long id, String name, User user) {
		super();
		this.skillId = id;
		this.user = user;
		this.name=name;
	}
	public Skill(String name, User user) {
		super();
		this.name = name;
		this.user = user;
	}
	public Skill(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getId() {
		return skillId;
	}
	public void setId(Long id) {
		this.skillId = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
