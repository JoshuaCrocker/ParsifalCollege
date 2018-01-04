package io.crocker.parsifalcollege.trip.component;

import java.util.Date;

import io.crocker.parsifalcollege.Address;
import io.crocker.parsifalcollege.cost.Cost;

public class Venue extends TripComponent {
	private Address address;
	private Date date;

	public Venue(String name, Address address, Date date, Cost cost) {
		super(name, cost);
		this.address = address;
		this.date = date;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
