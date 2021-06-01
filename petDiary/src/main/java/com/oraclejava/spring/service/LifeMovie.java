package com.oraclejava.spring.service;

public class LifeMovie {
	private int id;
	private String title;
	private String story;
	
	//생성자 자동생성하기
	//Source -> Generate constructors from superclass...
	public LifeMovie() {
		super();
		// TODO Auto-generated constructor stub
	}
	//Source -> Generate constructor from fields...
	public LifeMovie(int id, String title, String story) {
		super();
		this.id = id;
		this.title = title;
		this.story = story;
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setId(int id) {
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
