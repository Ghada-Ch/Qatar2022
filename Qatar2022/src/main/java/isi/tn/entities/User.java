package isi.tn.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonIgnore;


//import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)  
	@Column(name="userid")
	private Long id_user;
	private String email;
	private String password;
	
	
	//@ManyToMany(mappedBy="users",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	//@ManyToMany(mappedBy="users",cascade=CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnore
	
	//@JsonManagedReference//@JsonBackReference
	
	
	
	public User() {
		super();
	}
	public Long getId() {
		return id_user;
	}
	
	
	
	
	public User(Long id, String email, String pwd) {
		super();
		this.id_user = id;
		this.email = email;
		this.password = pwd;
		
	}
	public void setId(Long id) {
		this.id_user = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return password;
	}
	public void setPwd(String pwd) {
		this.password = pwd;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id_user + ", email=" + email + ", pwd=" + password
				+ "]";
	}
	
	
	

}
