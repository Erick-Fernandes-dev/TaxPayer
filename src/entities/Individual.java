package entities;

public class Individual extends TaxPayer {
	
	private Double healthExpenditures;
	
	public Individual(String name, Double anualIncome, Double healthExpenditures) {
		super(name, anualIncome);
		this.healthExpenditures = healthExpenditures;
	}
	
	public Individual() {
		this("", 0.0, 0.0);
	}
	
	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double tax() {
		
		if (super.getAnualIncome() < 20000.00) {
			return super.getAnualIncome() * 0.15;
			
		} else if (super.getAnualIncome() >= 20000.00) {
			return super.getAnualIncome() * 0.25 - this.healthExpenditures * 0.5;
			
		}
		return 0.0;
	}

}
