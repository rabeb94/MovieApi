package org.me.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class User implements Serializable{
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO) 
	private Long userId ;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public User(String email, String firstName ,String lastName, String password) {
		super();
		this.email = email;
		this.password = password;
		this.firstName=firstName;
		this.lastName=lastName;
	}
	public User(Long id, String firstName ,String lastName, String email, String password, Collection<Skill> skillsList) {
		super();
		this.userId = id;
		this.firstName=firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.skillsList = skillsList;
	}


	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Collection<Skill> getSkillsList() {
		return skillsList;
	}
	public void setSkillsList(Collection<Skill> skillsList) {
		this.skillsList = skillsList;
	}
	@OneToMany(mappedBy="user", fetch=FetchType.LAZY)
	private Collection<Skill> skillsList;

}
