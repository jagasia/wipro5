package com.wipro.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class UserInfo
{
	@Id
	private Integer id;
    private String name;
    private String email;
    private String password;
    private String roles;

    public UserInfo() {}

	public UserInfo(int id, String name, String email, String password, String roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}
}