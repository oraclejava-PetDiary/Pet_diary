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
@Table(name="users")
public class Users {
		@Id
		@SequenceGenerator(name="seq", sequenceName = "USERS_SEQ", initialValue = 4, allocationSize = 1)
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
		@Column(name="user_id")
		private Integer id;
		
		@Column(name="user_name")
		private String name;
		
		@Column(name="email")
		private String email;
		
		@Column(name="password")
		private String password;
		
		@Column(name="birthday")
		@DateTimeFormat(pattern="yyyy-MM-dd")
		private Date birthday;
		
		@Column(name="age")
		private Integer age;
		
		@Column(name="marriage")
		private boolean marriage;
		
		@Column(name="role")
		private String role;
		
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public Date getBirthday() {
			return birthday;
		}
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}
		public Integer getAge() {
			return age;
		}
		public void setAge(Integer age) {
			this.age = age;
		}
		public boolean isMarriage() {
			return marriage;
		}
		public void setMarriage(boolean marriage) {
			this.marriage = marriage;
		}
		public String getRole() {
			return role;
		}
		public void setRole(String role) {
			this.role = role;
		}
		
}