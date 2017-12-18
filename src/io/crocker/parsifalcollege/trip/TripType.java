package io.crocker.parsifalcollege.trip;

public enum TripType {
	SINGLE_DAY(false), RESIDENTIAL(true);

	private boolean requiresConsent;

	TripType(boolean requiresConsent) {
		this.requiresConsent = requiresConsent;
	}

	public boolean doesRequireConsent() {
		return this.requiresConsent;
	}
}
