package entities;

public class Company extends TaxPayer {
	
	private int numberOfEmplyees;
	
	public Company(String name, double anualIncome, int numberOfEmployees) {
		super(name, anualIncome);
		this.numberOfEmplyees = numberOfEmployees;
	}
	
	
	public Company() {
		this("", 0.0, 0);
	}
	
	public int getNumberOfEmplyees() {
		return numberOfEmplyees;
	}


	public void setNumberOfEmplyees(int numberOfEmplyees) {
		this.numberOfEmplyees = numberOfEmplyees;
	}


	@Override
	public double tax() {

		if (numberOfEmplyees > 10) {
			return super.getAnualIncome() * 0.14;
		} else {
			return super.getAnualIncome() * 0.16;
		}
	}
	
}
