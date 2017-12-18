package io.crocker.parsifalcollege.person;

import java.util.Date;

public class Guardian extends Person {
	private Relation relation;

	public Guardian(String firstName, String midleName, String lastName, Address address, Date dateOfBirth,
			String mobileNumber, Relation relation) {
		super(firstName, midleName, lastName, address, dateOfBirth, mobileNumber);
		this.relation = relation;
	}

	public Relation getRelation() {
		return relation;
	}

	public void setRelation(Relation relation) {
		this.relation = relation;
	}

}
