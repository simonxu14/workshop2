package com.server.bean;

import org.springframework.stereotype.Component;

@Component("profession")
public class Profession {
	private String ID;
	private String name;
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}
