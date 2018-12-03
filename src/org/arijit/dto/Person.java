package org.arijit.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name="PERSON_DETAILS")
public class Person {
	
	@Id
	@Column (name="PERSON_ID")
	private int id;
	
	@Column (name="LAST_NAME")
	private String lastName;
	private String firstName;
	private String address;
	private String city;
	
	/*public Person(int id, String lastName, String firstName, String address, String city) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.address = address;
		this.city = city;
	}*/

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	

}
