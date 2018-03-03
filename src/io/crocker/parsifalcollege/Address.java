package io.crocker.parsifalcollege;

public class Address {
	private String line1;
	private String line2;
	private String town;
	private String county;
	private String postcode;
	private String country = "United Kingdom";

	public Address(String line1, String line2, String town, String county, String postcode) {
		this.line1 = line1;
		this.line2 = line2;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
	}

	public Address(String line1, String line2, String town, String county, String postcode, String country) {
		this.line1 = line1;
		this.line2 = line2;
		this.town = town;
		this.county = county;
		this.postcode = postcode;
		this.country = country;
	}

}
