
public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSalary;
	
	public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate, double baseSalary){
		super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);
		
		if (baseSalary <0.0)
			throw new IllegalArgumentException(
					"Base salary must be >=0.0");
		this.baseSalary = baseSalary*1.1;
	}
	
	public void setBaseSalary(double baseSalary){
		if (baseSalary <0.0)
			throw new IllegalArgumentException(
					"Base salary must be >=0.0");
		this.baseSalary = baseSalary;
	}
	
	public double getBaseSalary(){return baseSalary;}
	
	@Override
	public String getClassName(){return "BasePlusCommissionEmployee";}
	@Override
	public double getPaymentAmount(){
		return getBaseSalary() + super.getPaymentAmount();
	}
	@Override
	public String toString(){
		return String.format("\n%s %s\n%s: %.2f\n%s: %.2f\n", "Base salaried",
				super.toString(),
				"Original Base Salary ",getBaseSalary() /1.1,
				"New Base Salary(*1.1)", getBaseSalary());
	}
}
