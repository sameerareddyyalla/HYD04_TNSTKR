package com.tns.controller;
/* class created by Sameera Reddy 
 * 21 nov 
 */

import java.time.LocalDate;

public class Placement {
	long id;
	String name;
	College college;
	LocalDate date;
	String qualification;
	int year;
	public Placement() {
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public College getcollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public LocalDate getdate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
}
