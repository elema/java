package com.cet.myh;
import java.util.Date;
public class Patient {
	String name;
	public Date dateOfBirth, dateOfAdmission;
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
}