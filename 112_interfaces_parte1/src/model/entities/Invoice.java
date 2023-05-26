package model.entities;

public class Invoice {

	private Double basicPayment;
	private Double tax;

	// Constructor
	public Invoice() {

	}

	public Invoice(Double basicPayment, Double tax) {
		this.basicPayment = basicPayment;
		this.tax = tax;
	}

	// Getters and Setters
	public Double getBasicPayment() {
		return basicPayment;
	}

	public void setBasicPayment(Double basicPayment) {
		this.basicPayment = basicPayment;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	// Method
	public Double getTotalPayment() {
		return getBasicPayment() - getTax();
	}

}
