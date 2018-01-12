package io.crocker.parsifalcollege.trip.component;

import java.util.Date;

import io.crocker.parsifalcollege.Address;
import io.crocker.parsifalcollege.cost.Cost;

public class Accommodation extends TripComponent {
	private Address address;
	private Date dateFrom;
	private Date dateTo;

	public Accommodation(String name, Address address, Date dateFrom, Date dateTo, Cost cost) {
		super(name, cost);
		this.address = address;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public int getNights() {
		// NYI
		return 0;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Date getDateFrom() {
		return dateFrom;
	}

	public void setDateFrom(Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	public Date getDateTo() {
		return dateTo;
	}

	public void setDateTo(Date dateTo) {
		this.dateTo = dateTo;
	}

}
