package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int N = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= N; i++) {
			
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or Company (i/c)? ");
			String ta = sc.nextLine();
			
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double anualIncome = Double.parseDouble(sc.nextLine());
			
			if (ta.equalsIgnoreCase("i")) {
				System.out.print("Health expenditures: ");
				double healthExpenditures = Double.parseDouble(sc.nextLine());
				list.add(new Individual(name, anualIncome, healthExpenditures));
				
			} else if (ta.equalsIgnoreCase("c")) {
				System.out.print("Number of employees: ");
				int numberOfEmployees = Integer.parseInt(sc.nextLine());
				list.add(new Company(name, anualIncome, numberOfEmployees));
				
			} else {
				continue;
			}
		}
		
		System.out.println();
		System.out.println("TAXE PAID: ");
		
		for (TaxPayer ta : list) {
			System.out.println(ta.getName() + ": $ " + String.format("%.2f", ta.tax()));
		}
		
		System.out.println();
		
		double sum = 0.0;
		
		for (TaxPayer ta : list) {
			sum += ta.tax();
			
		}
		
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));
	}

}
