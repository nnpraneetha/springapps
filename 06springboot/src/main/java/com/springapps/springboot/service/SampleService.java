package com.springapps.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springapps.springboot.dao.SampleDAO;

@Component
public class SampleService {

	
	SampleDAO sampleDao;
	
	@Autowired
	public SampleService(SampleDAO sampleDao) {
		System.out.println("sample service constructor...");
		this.sampleDao = sampleDao;
	}
	
	public void save() {
		System.out.println("Inside service save method");
		sampleDao.create();
	}
	
}