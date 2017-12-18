package io.crocker.parsifalcollege.trip.component;

import java.util.Date;

public class Accommodation extends TripComponent {
	private String name;
	private Address address;
	private Date dateFrom;
	private Date dateTo;

	public Accommodation(String name, Address address, Date dateFrom, Date dateTo, Cost cost) {
		super(cost);
		this.name = name;
		this.address = address;
		this.dateFrom = dateFrom;
		this.dateTo = dateTo;
	}

	public int getNights() {
		// NYI
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
