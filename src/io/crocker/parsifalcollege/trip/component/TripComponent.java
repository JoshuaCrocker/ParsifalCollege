package io.crocker.parsifalcollege.trip.component;

import io.crocker.parsifalcollege.cost.Cost;

public abstract class TripComponent {
	private String description;
	private Cost cost;

	public TripComponent(String description, Cost cost) {
		this.description = description;
		this.cost = cost;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Cost getCost() {
		return cost;
	}

	public void setCost(Cost cost) {
		this.cost = cost;
	}

}
