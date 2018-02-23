package tw.sales.tax;

public enum Taxes {
	SalesTax(10.0D), CustomDuty(5.0D);
	
	private double taxPercent;
	
	Taxes(double taxPercent) {
		this.taxPercent = taxPercent;
	}
	
	public double getTaxPercent() {
		return taxPercent;
	}
}
