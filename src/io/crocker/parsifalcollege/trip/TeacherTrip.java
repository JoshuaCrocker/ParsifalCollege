package io.crocker.parsifalcollege.trip;

public class TeacherTrip extends Trip {

	private List<TripComponent> tripComponents = new List<TripComponent>();

	public TeacherTrip() {
		super();
	}

	public TeacherTrip(TripType tripType) {
		super(tripType);
	}

	public void addTripComponent(TripComponent booking) {
		// NYI
	}

	public TripComponent getTripComponent(int index) {
		// NYI
	}

	public boolean removeTripComponent(int index) {
		// NYI
	}
}
