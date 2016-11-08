
public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, double wage, double hours){
		super(firstName, lastName, socialSecurityNumber);
		
		if(wage < 0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		if((hours < 0.0) || (hours > 168.0))
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168");
		this.hours = hours;
		this.wage = wage;
	}

	public void setWage(double wage){
		if(wage < 0.0)
			throw new IllegalArgumentException("Hourly wage must be >= 0.0");
		this.wage = wage;
	}
	
	public void setHours(double hours){
		if(hours < 0.0 || hours > 168.0)
			throw new IllegalArgumentException("Hours worked must be >= 0.0 and <= 168");
		this.hours = hours;
	}
	
	public double getWage(){return this.wage;}
	public double getHours(){return this.hours;}
	
	@Override
	public String getClassName(){
		return "HourlyEmployee ";
	}
	@Override
	public double getPaymentAmount(){
		if(getHours() <= 40)
			return getWage() * getHours();
		else
			return 40 * getWage() + (getHours() - 40) *getWage() * 1.5; 
	}
	@Override
	public String toString(){
		return String.format("Hourly employee: \n%s\n%s: $%,.2f; %s: %,.2f\n",
				super.toString(),
				"Hourly Wage ", getWage(), 
				"Hours Worked ", getHours());
	}
}
