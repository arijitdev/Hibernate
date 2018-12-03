package org.arijit.dto;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table (name="EMPLOYEE_DETAILS")
public class Employee {
	
	@Id @GeneratedValue
	private int id;
	private String name;
	private float salary;
	
	@Temporal (TemporalType.DATE)
	private Date joinedDate;
	private String address;
	
	//@Transient
	@Lob
	private String description;
	
	/*public Employee(int id, String name, float salary, Date joinedDate, String address, String description) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.joinedDate = joinedDate;
		this.address = address;
		this.description = description;
	}*/

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

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public Date getJoinedDate() {
		return joinedDate;
	}

	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
