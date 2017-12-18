package io.crocker.parsifalcollege.person;

import java.util.ArrayList;
import java.util.Date;

public class Student extends Person {
	private ArrayList<Guardian> guardians = new ArrayList<Guardian>();

	public Student(String firstName, String midleName, String lastName, Address address, Date dateOfBirth,
			String mobileNumber) {
		super(firstName, midleName, lastName, address, dateOfBirth, mobileNumber);
	}

	public ArrayList<Guardian> getGuardians() {
		return guardians;
	}

	public void setGuardians(ArrayList<Guardian> guardians) {
		this.guardians = guardians;
	}

	public void addGuardian(Guardian booking) {
		// NYI
	}

	public Guardian getGuardian(int index) {
		// NYI
	}

	public boolean removeGuardian(int index) {
		// NYI
	}

}
