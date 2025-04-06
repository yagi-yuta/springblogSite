package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Integer id;

	private String email;

	private String name;

	private String password;

	//ゲッター

	public Integer getId() {

		return id;
	}

	public String getEmai() {

		return email;
	}

	public String getName() {

		return name;
	}

	public String getPassword() {

		return password;
	}

}
