package io.crocker.parsifalcollege.trip;

import java.util.ArrayList;

import io.crocker.parsifalcollege.cost.Cost;
import io.crocker.parsifalcollege.trip.component.TripComponent;

public class TeacherTrip extends Trip {

	private ArrayList<TripComponent> tripComponents = new ArrayList<TripComponent>();

	public TeacherTrip() {
		super();
	}

	public TeacherTrip(TripType tripType) {
		super(tripType);
	}

	public ArrayList<TripComponent> getTripComponents() {
		return tripComponents;
	}

	public void setTripComponents(ArrayList<TripComponent> tripComponents) {
		this.tripComponents = tripComponents;
	}

	public void addTripComponent(TripComponent booking) {
		// NYI
	}

	public TripComponent getTripComponent(int index) {
		// NYI
		return null;
	}

	public boolean removeTripComponent(int index) {
		// NYI
		return false;
	}

	public Cost getCost() {
		// NYI
		return null;
	}
}
