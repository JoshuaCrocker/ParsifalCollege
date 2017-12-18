package io.crocker.parsifalcollege.trip.component;

public class Sundry extends TripComponent {
	private String description;

	public Sundry(String description, Cost cost) {
		super(cost);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
