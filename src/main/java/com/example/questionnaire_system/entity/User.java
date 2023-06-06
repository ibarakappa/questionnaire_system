package com.example.questionnaire_system.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	@Id
	@Column(name = "user_email")
	private Integer userEmail;

	@Column(name = "user_name")
	private Integer userName;

	@Column(name = "user_phone")
	private Integer userPhone;

	@Column(name = "user_age")
	private Integer userAge;

	public Integer getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(Integer userEmail) {
		this.userEmail = userEmail;
	}

	public Integer getUserName() {
		return userName;
	}

	public void setUserName(Integer userName) {
		this.userName = userName;
	}

	public Integer getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(Integer userPhone) {
		this.userPhone = userPhone;
	}

	public Integer getUserAge() {
		return userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

}
