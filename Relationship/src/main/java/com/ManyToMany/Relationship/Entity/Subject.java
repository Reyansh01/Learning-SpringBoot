package com.ManyToMany.Relationship.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.JoinColumn;

@Entity
@Table(name="ManyToManySubject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "subject_id")
	private int subjectID;
	
	private String subjectName;
	private String subjectAuthor;
	private String subjectLanguage;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "subject_user", joinColumns = { @JoinColumn(name = "subject_id")}, 
	inverseJoinColumns = { @JoinColumn(name = "user_id")})
//	@JsonManagedReference
//	@JsonIgnore
	private Set<User> user = new HashSet<>();
	
	public Subject() {
		
	}
	
	public Subject(int subjectID, String subjectName, String subjectAuthor, String subjectLanguage) {
		super();
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.subjectAuthor = subjectAuthor;
		this.subjectLanguage = subjectLanguage;
	}
	
	
	public Set<User> getUser() {
		return user;
	}

	public void setUser(Set<User> user) {
		this.user = user;
	}
	

	public int getSubjectID() {
		return subjectID;
	}
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	public String getSubjectAuthor() {
		return subjectAuthor;
	}
	public void setSubjectAuthor(String subjectAuthor) {
		this.subjectAuthor = subjectAuthor;
	}
	public String getSubjectLanguage() {
		return subjectLanguage;
	}
	public void setSubjectLanguage(String subjectLanguage) {
		this.subjectLanguage = subjectLanguage;
	}
	
}
