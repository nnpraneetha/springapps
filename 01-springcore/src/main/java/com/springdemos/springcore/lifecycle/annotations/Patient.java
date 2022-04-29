package com.springdemos.springcore.lifecycle.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Patient  {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("id setter method...");
	}

	@PostConstruct
	public void hi() {
		System.out.println("Hello...");
	}

	@PreDestroy
	public void bye() {
		System.out.println("Bye...");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	

}
