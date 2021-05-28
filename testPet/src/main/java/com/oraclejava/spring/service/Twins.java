package com.oraclejava.spring.service;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Twins {
	
	@NotNull
	@Min(0)
	@Max(999)
	private Integer id;
	
	@NotBlank(message="선수 이름을 입력해 주십시오")
	@Size(min=2, max=60,  message="이름은 2자이상 60자 이하로 입력해 주십시오")  // 김진,,   레오나르도 디카프리오  
	private String name;
	
	@NotNull
	@Min(0)
	@Max(9999999)
	private Integer salary;
	
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
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	
	
	
	
}
