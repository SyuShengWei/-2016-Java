
public class Employee extends Object{
	private final String firstName;
	private final String lastName;
	private final String socialSecurityNumber;
	
	public Employee(String firstName,String lastName,String socialSecurityNumber){
		this.firstName = firstName;
		this.lastName  = lastName;
		this.socialSecurityNumber = socialSecurityNumber ; 
	}
	
	public String getFirstName(){return this.firstName;}

	public String getLastName(){return this.lastName;}
	
	public String getSocialSecurityNumber(){return this.socialSecurityNumber;}

	@Override 
	public String toString(){
		return String.format("%s: %s %s%n%s: %s",
				"Employee",this.firstName,this.lastName,
				"social security number",this.socialSecurityNumber);
	}
}
