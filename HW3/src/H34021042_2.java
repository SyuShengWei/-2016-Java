
public class H34021042_2 {
	public static void main (String args[]){
		System.out.println("CommissionEmployeeTest");
		
		CommissionEmployee employee1 = new CommissionEmployee(
				"Sue","Jones","222-22-2222",10000,.06);
		
		System.out.println("Employee information obtain by get methods:");
		System.out.printf("%n%s %s%n","First name is",employee1.getFirstName());
		System.out.printf("%s %s%n","Last name is",employee1.getLastName());
		System.out.printf("%s %s%n","Social Security number is",employee1.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n","Gross sales is",employee1.getGrossSales());
		System.out.printf("%s %.2f%n","Commission rate is",employee1.getCommissionRate());
		employee1.setGrossSales(5000);
		employee1.setCommissionRate(.1);
		System.out.printf("%n%s:%n%n%s%n",
				"Updated employee information obtained by to String",employee1);
		
		System.out.println("\nBasePlusCommissionEmployeeTest\n");
		
		BasePluseCommissionEmployee employee2 = new BasePluseCommissionEmployee(
				"Bob","Lewis","333-33-3333",5000,.04, 300);
		
		System.out.println("Employee information obtain by get methods:");
		System.out.printf("%n%s %s%n","First name is",employee2.getFirstName());
		System.out.printf("%s %s%n","Last name is",employee2.getLastName());
		System.out.printf("%s %s%n","Social Security number is",employee2.getSocialSecurityNumber());
		System.out.printf("%s %.2f%n","Gross sales is",employee2.getGrossSales());
		System.out.printf("%s %.2f%n","Commission rate is",employee2.getCommissionRate());
		System.out.printf("%s %.2f%n","Base salary is",employee2.getBaseSalary());
		
		employee2.setBaseSalary(1000);;
		System.out.printf("%n%s:%n%n%s%n",
				"Updated employee information obtained by to String",employee2.toString());
	}
}
