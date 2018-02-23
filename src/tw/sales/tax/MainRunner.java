package tw.sales.tax;

import java.util.ArrayList;
import java.util.List;

public class MainRunner {
	public static void main(String[] args) {
		List<Good> goods = new ArrayList<Good> ();
		Good book = new Good();
		book.setCostPrice(12.49);
		book.setGoodType(GoodType.Book);
		
		Good chocolate = new Good();
		chocolate.setCostPrice(0.85);
		chocolate.setGoodType(GoodType.Food);
		
		Good musicCD = new Good();
		musicCD.setCostPrice(14.99);
		
		goods.add(book);
		goods.add(musicCD);
		goods.add(chocolate);
		
		TaxCalculator salesTaxCalculator = new SalesTaxCalculator();
		TaxCalculator customDutyCalculator = new CustomDutyCalculator();
		double bill = 0D;
		for(Good good : goods) {
			salesTaxCalculator.calculateTax(good);
			customDutyCalculator.calculateTax(good);
			double goodTotalPrice = good.getCostPrice() + good.getTax();
			bill = bill + goodTotalPrice;
			System.out.println(goodTotalPrice);
		}
		
		System.out.println(bill);
	}
	
}
