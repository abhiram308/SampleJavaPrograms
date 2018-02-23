package tw.sales.tax;

public class Good {
	private double costPrice;
	private double tax;
	private boolean isImported;
	private GoodType goodType;
	
	public Good() {
		costPrice = 0D;
		tax = 0D;
		isImported = false;
		goodType = GoodType.Other;
	}
	
	public double getCostPrice() {
		return costPrice;
	}
	public void setCostPrice(double costPrice) {
		this.costPrice = costPrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	public boolean isImported() {
		return isImported;
	}
	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}
	public GoodType getGoodType() {
		return goodType;
	}
	public void setGoodType(GoodType goodType) {
		this.goodType = goodType;
	}
}