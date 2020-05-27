package com.example.demo.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Entity
public class InputData {
	
	@Id
	@GeneratedValue
	private int intId;
	@Size(min = 2,max=5,message = "Name Should have at least 2 and Maximum 4 character")
	private String inData;
	public int getIntId() {
		return intId;
	}
	public void setIntId(int intId) {
		this.intId = intId;
	}
	public String getInData() {
		return inData;
	}
	public void setInData(String inData) {
		this.inData = inData;
	}
	public InputData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public InputData(int intId, String inData) {
		super();
		this.intId = intId;
		this.inData = inData;
	}

	
	
	
	

}
