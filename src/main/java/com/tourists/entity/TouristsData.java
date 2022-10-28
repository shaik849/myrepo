package com.tourists.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TouristsData {
	@Id
   private int id;
   private String firstname; 
   private String lastname;
   private String gender;
   private int age;
   private String fromPlace;
   private int numberofDaysVisits;
   public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getFromPlace() {
	return fromPlace;
}
public void setFromPlace(String fromPlace) {
	this.fromPlace = fromPlace;
}
public int getNumberofDaysVisits() {
	return numberofDaysVisits;
}
public void setNumberofDaysVisits(int numberofDaysVisits) {
	this.numberofDaysVisits = numberofDaysVisits;
}

public TouristsData(int id, String firstname, String lastname, String gender, int age, String fromPlace,
		int numberofDaysVisits) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.gender = gender;
	this.age = age;
	this.fromPlace = fromPlace;
	this.numberofDaysVisits = numberofDaysVisits;
}
public TouristsData() {
	super();
	// TODO Auto-generated constructor stub
}

  
   
}
