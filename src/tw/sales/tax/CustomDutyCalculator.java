package tw.sales.tax;

public class CustomDutyCalculator implements TaxCalculator {

	private static final double taxPercent = Taxes.CustomDuty.getTaxPercent();

	@Override
	public void calculateTax(Good good) {
		
		if (good.isImported()) {
			double tax = good.getCostPrice() * taxPercent / 100;
			good.setTax(good.getTax() + tax);
		}
	}

}
