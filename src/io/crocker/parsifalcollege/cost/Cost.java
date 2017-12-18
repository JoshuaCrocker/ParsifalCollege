package io.crocker.parsifalcollege.cost;

public class Cost {
	private double amount;
	private double vatRate = 0.2;
	private CostType costType = CostType.INCLUDING_VAT;

	public Cost(double amount) {
		this.amount = amount;
	}

	public Cost(double amount, double vatRate) {
		this.amount = amount;
		this.vatRate = vatRate;
	}

	public Cost(double amount, CostType costType) {
		this.amount = amount;
		this.costType = costType;
	}

	public Cost(double amount, double vatRate, CostType costType) {
		this.amount = amount;
		this.vatRate = vatRate;
		this.costType = costType;
	}

	public double calculateVAT() {
		// NYI
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public double getVatRate() {
		return vatRate;
	}

	public void setVatRate(double vatRate) {
		this.vatRate = vatRate;
	}

	public CostType getCostType() {
		return costType;
	}

	public void setCostType(CostType costType) {
		this.costType = costType;
	}

}
