package com.oraclejava.spring.service;

 

public class LifeMovie {
	private Integer id;
	private String title;
	private String story;
	
	//생성자 자동생성하기
	//Source->Generate constructor from superclass...
	public LifeMovie() {
		super();
	}
	//Source->Generate constructor using fields...
	 
	public LifeMovie(Integer id, String title, String story) {
		super();
		this.id = id;
		this.title = title;
		this.story = story;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getStory() {
		return story;
	}
	public void setStory(String story) {
		this.story = story;
	}
}


