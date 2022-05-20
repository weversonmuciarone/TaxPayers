package entities;

public class Individual extends TaxPayers{
	private double healthExpenditure;
	
	public Individual() {
		super();
	}
	

	public Individual(String name, double anualIncome, double healthExpenditure) {
		super(name, anualIncome);
		this.healthExpenditure = healthExpenditure;
	}


	public double getHealthExpenditure() {
		return healthExpenditure;
	}


	public void setHealthExpenditure(double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}


	@Override
	public double tax() {
		if(getAnualIncome() < 20000.00) {
			return getAnualIncome() * 0.15 - healthExpenditure * 0.5;
		}
		else { 
			return getAnualIncome() * 0.25 - healthExpenditure * 0.5;
		}
	}
	

}
