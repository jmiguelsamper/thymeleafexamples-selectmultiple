package com.thymeleafexamples.select.domain;

import java.util.List;

public class User {

	private String id;

	private List<Hobby> hobbies;

	public User() {
	}

	public User(String id, List<Hobby> hobbies) {
		this.id = id;
		this.hobbies = hobbies;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
}
