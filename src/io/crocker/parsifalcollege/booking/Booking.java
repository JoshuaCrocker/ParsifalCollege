package io.crocker.parsifalcollege.booking;

import java.util.ArrayList;

import io.crocker.parsifalcollege.cost.Cost;
import io.crocker.parsifalcollege.person.Student;

public class Booking {
	private Student student;
	private Consent consent;
	private ArrayList<Payment> payments = new ArrayList<Payment>();

	public Booking(Student student) {
		this.student = student;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Consent getConsent() {
		return consent;
	}

	public void setConsent(Consent consent) {
		this.consent = consent;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	public void addPayment(Payment booking) {
		// NYI
	}

	public Payment getPayment(int index) {
		// NYI
	}

	public boolean removePayment(int index) {
		// NYI
	}

	public Cost getRemainingBalance() {
		// NYI
	}

}
