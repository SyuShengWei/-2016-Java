
public class CommissionEmployee extends Employee{
	private double grossSales;
	private double commissionRate;
	
	public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, double grossSales, double commissionRate){
		super(firstName, lastName, socialSecurityNumber);
		
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		
		if(commissionRate <= 0.0 || commissionRate>= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 or < 1.0");
		this.grossSales 	= grossSales;
		this.commissionRate = commissionRate;
	}
	
	public void setGrossSales(double grossSales){
		if(grossSales < 0.0)
			throw new IllegalArgumentException(
					"Gross sales must be >= 0.0");
		this.grossSales = grossSales;
	}
	
	public void setCommissionRate(double commissionRate){
		if(commissionRate <= 0.0 || commissionRate>= 1.0)
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 or < 1.0");
		this.commissionRate = commissionRate;
	}
	
	public double getGrossSales(){return this.grossSales;}
	public double getCommissionRate(){return this.commissionRate;}
	
	public double getPaymentAmount(){
		return getGrossSales()*getCommissionRate();
	}
	@Override
	public String getClassName(){return "CommissionEmployee";}
	
	@Override
	public String toString(){
		return String.format("%s\n%s\n%s: %.2f\n%s: %.2f", 
				"Commission employee ", super.toString(),
				"Gross sales ",getGrossSales(),
				"Commission rate ", getCommissionRate());
	}
}