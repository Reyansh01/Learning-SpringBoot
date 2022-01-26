package com.ManyToMany.Relationship.Entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

//import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="ManyToManyUser")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_id")
	private int userID;
	
	private String name;
	private String email;
	private String phoneNo;
	private String address;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "subject_user", joinColumns = { @JoinColumn(name = "user_id")}, 
	inverseJoinColumns = { @JoinColumn(name = "subject_id")})
//	@JsonBackReference
	@JsonIgnore
	private Set<Subject> subject = new HashSet<>();
	
	public User() {
		
	}
	
	public User(int userID, String name, String email, String phoneNo, String address) {
		super();
		this.userID = userID;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.address = address;
	}
	
	
	public Set<Subject> getSubject() {
		return subject;
	}

	public void setSubject(Set<Subject> subject) {
		this.subject = subject;
	}


	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
