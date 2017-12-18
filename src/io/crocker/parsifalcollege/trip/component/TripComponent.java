package io.crocker.parsifalcollege.trip.component;

public abstract class TripComponent {
	private Cost cost;

	public TripComponent(Cost cost) {
		this.cost = cost;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

}
