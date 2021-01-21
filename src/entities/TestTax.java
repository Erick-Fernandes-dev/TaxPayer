package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class TestTax {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		TaxPayer t = new Individual("Erick", 50000.0, 2000.0);
		
		List<TaxPayer> list = new ArrayList<>();
		list.add(t);
		list.add(new Company("Algnologia", 400000.0, 25));
		
		for (TaxPayer ta : list) {
			System.out.println(String.format("%.2f",ta.tax()));
		}
		
	}

}
