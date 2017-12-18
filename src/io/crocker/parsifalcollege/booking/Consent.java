package io.crocker.parsifalcollege.booking;

import java.util.Date;

public class Consent {
	private Guardian guardian;
	private Date dateSigned;

	public Consent() {

	}

	public Consent(Guardian guardian, Date dateSigned) {
		this.guardian = guardian;
		this.dateSigned = dateSigned;
	}

	public Guardian getGuardian() {
		return guardian;
	}

	public void setGuardian(Guardian guardian) {
		this.guardian = guardian;
	}

	public Date getDateSigned() {
		return dateSigned;
	}

	public void setDateSigned(Date dateSigned) {
		this.dateSigned = dateSigned;
	}

}
