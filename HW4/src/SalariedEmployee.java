
public class SalariedEmployee extends Employee{
	private double weeklySalary;
	
	public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary){
		super(firstName, lastName, socialSecurityNumber);
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}
	public void setWeeklySalary(double weeklySalary){
		if (weeklySalary < 0.0)
			throw new IllegalArgumentException("Weekly salary must be >= 0.0");
		this.weeklySalary = weeklySalary;
	}
	
	public double getWeeklySalary(){return this.weeklySalary;}
	@Override
	public String getClassName(){return "SalariedEmployee ";}
	
	@Override
	public double getPaymentAmount(){
		return getWeeklySalary();
	}
	
	@Override 
	public String toString(){
		return String.format("Salaried employee: \n%s\n%s: $%,.2f\n",
				super.toString(), 
				"Weekly Salary ", getWeeklySalary());
	}
}