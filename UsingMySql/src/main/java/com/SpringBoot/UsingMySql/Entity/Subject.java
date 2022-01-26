package com.SpringBoot.UsingMySql.Entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "subject")
public class Subject {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="subject_id")
	private int subjectID;
	private String subjectname;
	private String subjectauthor;
	private String subjectlanguage;
	

	@OneToMany(targetEntity = User.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "subject_subject_id") // Not required.
	@JsonManagedReference
	private List<User> user;
	
	public Subject() {
		
	}

	public Subject(int subjectID, String subjectname, String subjectauthor, String subjectlanguage, List<User> user) {
		super();
		this.subjectID = subjectID;
		this.subjectname = subjectname;
		this.subjectauthor = subjectauthor;
		this.subjectlanguage = subjectlanguage;
		this.user = user;
	}
	
	public int getSubjectID() {
		return subjectID;
	}
	
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}
	
	public String getSubjectname() {
		return subjectname;
	}
	
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	
	public String getSubjectauthor() {
		return subjectauthor;
	}
	
	public void setSubjectauthor(String subjectauthor) {
		this.subjectauthor = subjectauthor;
	}
	
	public String getSubjectlanguage() {
		return subjectlanguage;
	}
	
	public void setSubjectlanguage(String subjectlanguage) {
		this.subjectlanguage = subjectlanguage;
	}
	
	public List<User> getUser() {
		return this.user;
	}
	
	public void setUser(List<User> user) {
		this.user = user;
	}

	
}
