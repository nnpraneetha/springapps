package com.springdemos.springcore.lifecycle.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean, DisposableBean {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
		System.out.println("id setter method...");
	}

	// Init method
	public void hi() {
		System.out.println("Hello...");
	}

	

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside destroy method...");

	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside AfterPropertiesSet method...");

	}

}
