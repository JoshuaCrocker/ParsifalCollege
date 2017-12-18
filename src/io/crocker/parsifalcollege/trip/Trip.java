package io.crocker.parsifalcollege.trip;

import java.util.ArrayList;

public abstract class Trip {
	private TripType tripType;
	private ArrayList<Booking> bookings = new ArrayList<Booking>();

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

	public ArrayList<Booking> getBookings() {
		return bookings;
	}

	public void setBookings(ArrayList<Booking> bookings) {
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
