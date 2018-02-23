package tw.sales.tax;

public class SalesTaxCalculator implements TaxCalculator {

	private static final double taxPercentage = Taxes.SalesTax.getTaxPercent();
	
	@Override
	public void calculateTax(Good good) {
	
		if (good.getGoodType().equals(GoodType.Other)) {
			double tax = good.getCostPrice() * taxPercentage / 100;
			good.setTax(good.getTax() + tax);
		}
	}

}
