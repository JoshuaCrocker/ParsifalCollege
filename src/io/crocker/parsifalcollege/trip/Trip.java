package io.crocker.parsifalcollege.trip;

import java.util.List;

public abstract class Trip {
	private TripType tripType;
	private List<Booking> bookings = new List<Booking>();

	public Trip() {
		this.tripType = TripType.SINGLE_DAY;
	}

	public Trip(TripType tripType) {
		this.tripType = tripType;
	}

	public TripType getTripType() {
		return tripType;
	}

	public void setTripType(TripType tripType) {
		this.tripType = tripType;
	}

	public List<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(List<Booking> bookings) {
		this.bookings = bookings;
	}

	public void addBooking(Booking booking) {
		// NYI
	}

	public Booking getBooking(int index) {
		// NYI
	}

	public boolean removeBooking(int index) {
		// NYI
	}

}
