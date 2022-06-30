package com.springdemos.springcore.stereotype.annotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("supercoach")
//@Scope("prototype")

@Component
public class Coach {

	@Value("11")
	private int id = 9;

	@Value("Praneetha")
	private String name;

	@Value("${dbuser}")
	private String dbuser;

	@Value("#{topics}")
	private List<String> topics;

	@Autowired
	private CoachProfile coachprofile;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDbuser() {
		return dbuser;
	}

	public void setDbuser(String dbuser) {
		this.dbuser = dbuser;
	}

	public List<String> getTopics() {
		return topics;
	}

	public void setTopics(List<String> topics) {
		this.topics = topics;
	}

	public CoachProfile getCoachprofile() {
		return coachprofile;
	}

	public void setCoachprofile(CoachProfile coachprofile) {
		this.coachprofile = coachprofile;
	}

	@Override
	public String toString() {
		return "Coach [id=" + id + ", name=" + name + ", dbuser=" + dbuser + ", topics=" + topics + ", coachprofile="
				+ coachprofile + "]";
	}

}
