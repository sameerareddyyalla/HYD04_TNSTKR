package com.tns.entity;

/* class created by Sameera Reddy Yalla

 * Date created 21-11-2023
 */

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="placement")
public class Placement {
	@Id
	long id;
	String name;
	College college;
	LocalDate date;
	String qualification;
	int year;
	public Placement(long id,String name,College college,LocalDate date,String qualification,int year) {
		this.id = id;
		this.name = name;
		this.college = college;
		this.date = date;
		this.qualification = qualification;
		this.year = year;
		
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
