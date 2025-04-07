package com.example.demo.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class User {
	
private String name;
private String email;
private String password;
private String passwordConfirm;

//ゲッター
public String getName() {
	return name;
}
public String getEmail() {
	return email;
}
public String getPassword() {
	return password;
}
public String getPasswordConfirm() {
	return passwordConfirm;
}



public void setName(String name) {
	this.name = name;
}
public void setEmail(String email) {
	this.email = email;
}
public void setPassword(String password) {
	this.password = password;
}
public void setPasswordConfirm(String passwordconfirm) {
	this.passwordConfirm = passwordconfirm;
}

}
