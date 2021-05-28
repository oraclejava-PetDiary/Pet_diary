package com.oraclejava.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;
 

@Entity
@Table(name="users")//생략가능
public class Users {
	
	
	@Id
	@SequenceGenerator(name="seq",sequenceName="USERS_SEQ",initialValue =4, allocationSize=1)//데이터가 있어서 시작값 4
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="seq")
	
	
	@Column(name="user_id")//실제 데이터베이스 컬럼
	private Integer id;
	
	@Column(name="user_name")
	private String name;
	
	@Column(name="email")
	private String email;
	
	@Column(name="passwd")
	private String passwd;
	
	@Column(name="birthday")
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;
	
	@Column(name="age")
	private int age;
	
	@Column(name="marriage")
	private boolean marriage;
	
	@Column(name="role")
	private String role;



	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isMarriage() {
		return marriage;
	}

	public void setMarrage(boolean marriage) {
		this.marriage = marriage;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	


}
