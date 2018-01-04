package io.crocker.parsifalcollege.trip.component;

import java.util.Date;

import io.crocker.parsifalcollege.Address;
import io.crocker.parsifalcollege.cost.Cost;

public class Transport extends TripComponent {
	private Address addressFrom;
	private Address addressTo;
	private Date date;

	public Transport(String companyName, Address addressFrom, Address addressTo, Date date, Cost cost) {
		super(companyName, cost);
		this.addressFrom = addressFrom;
		this.addressTo = addressTo;
		this.date = date;
	}

	public Address getAddressFrom() {
		return addressFrom;
	}

	public void setAddressFrom(Address addressFrom) {
		this.addressFrom = addressFrom;
	}

	public Address getAddressTo() {
		return addressTo;
	}

	public void setAddressTo(Address addressTo) {
		this.addressTo = addressTo;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

}
