package com.server.bean;

import org.springframework.stereotype.Component;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@Component("activeMachine")
@XStreamAlias("activeMachineData")
public class ActiveMachine {
	private String ID;
	private String time;
	private String moveTime;
	private String restTime;
	private String displacement;
	private String sTime;
	private String machineID;
	
	public ActiveMachine(){}
	
	public ActiveMachine(String ID,String time,String moveTime,String restTime,
			String displacement,String sTime,String machineID){
		this.ID = ID;
		this.time = time;
		this.moveTime = moveTime;
		this.restTime = restTime;
		this.displacement = displacement;
		this.sTime = sTime;
		this.machineID = machineID;
	}
	
	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getMoveTime() {
		return moveTime;
	}
	public void setMoveTime(String moveTime) {
		this.moveTime = moveTime;
	}
	public String getRestTime() {
		return restTime;
	}
	public void setRestTime(String restTime) {
		this.restTime = restTime;
	}
	public String getDisplacement() {
		return displacement;
	}
	public void setDisplacement(String displacement) {
		this.displacement = displacement;
	}
	public String getsTime() {
		return sTime;
	}
	public void setsTime(String sTime) {
		this.sTime = sTime;
	}
	public String getMachineID() {
		return machineID;
	}
	public void setMachineID(String machineID) {
		this.machineID = machineID;
	}
	
}
