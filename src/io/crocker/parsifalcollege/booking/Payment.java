package io.crocker.parsifalcollege.booking;

import java.util.Date;

import io.crocker.parsifalcollege.cost.Cost;

public class Payment {
	private Cost amount;
	private Date datePaid;

	public Payment(Cost amount, Date datePaid) {
		this.amount = amount;
		this.datePaid = datePaid;
	}
}
