package io.crocker.parsifalcollege.person;

import java.util.Date;

import io.crocker.parsifalcollege.Address;

public class Teacher extends Person {
	private String department;

	public Teacher(String firstName, String midleName, String lastName, Address address, Date dateOfBirth,
			String mobileNumber, String department) {
		super(firstName, midleName, lastName, address, dateOfBirth, mobileNumber);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
