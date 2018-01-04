package io.crocker.parsifalcollege.trip;

import io.crocker.parsifalcollege.cost.Cost;

public class ExternalProviderTrip extends Trip {
	private Cost entranceFee;

	public ExternalProviderTrip(Cost entranceFee) {
		super();
		this.entranceFee = entranceFee;
	}

	public ExternalProviderTrip(TripType tripType, Cost entranceFee) {
		super(tripType);
		this.entranceFee = entranceFee;
	}

	public Cost getEntranceFee() {
		return entranceFee;
	}

	public void setEntranceFee(Cost entranceFee) {
		this.entranceFee = entranceFee;
	}

	public Cost getCost() {
		// NYI
	}

}
