package com.server.bean;

import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Component("dynamicWorkshop")
@XStreamAlias("dynamicWorkshopData")
public class DynamicWorkshop {
	
	private String ID;
	private String workshopID;
	private String temperature;
	private String humidity;
	private String noise;
	
	public DynamicWorkshop(){}
	
	public DynamicWorkshop(String ID,String workshopID,String temperature,String humidity,String noise){
		this.ID = ID;
		this.workshopID = workshopID;
		this.temperature = temperature;
		this.humidity = humidity;
		this.noise = noise;
	}
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getWorkshopID() {
		return workshopID;
	}
	public void setWorkshopID(String workshopID) {
		this.workshopID = workshopID;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getNoise() {
		return noise;
	}
	public void setNoise(String noise) {
		this.noise = noise;
	}
	
}
