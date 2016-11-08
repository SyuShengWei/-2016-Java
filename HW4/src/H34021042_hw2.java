
public class H34021042_hw2 {
	public  static void main (String args[]){
		
		Payable[] Payable_Objects = new Payable[6];
		Payable_Objects[0] = new Invoice("01234", "seat", 2, 375.00);
		Payable_Objects[1] = new Invoice("56789", "tire", 4, 79.95);
		Payable_Objects[2] = new SalariedEmployee			("John", "Smith", "111-11-1111", 800.00);
		Payable_Objects[3] = new HourlyEmployee				("Karen", "Price", "222-22-2222", 16.75, 40.00);
		Payable_Objects[4] = new CommissionEmployee			("Sue", "Jone", "333-33-3333", 10000.00, 0.06);
		Payable_Objects[5] = new BasePlusCommissionEmployee	("Bob", "Lewis", "444-44-4444", 5000.00, 0.04, 300.00);
		
		System.out.println("BasePlusCommissionEmployee is created,automatically pluse the base salary.");
		
		System.out.println("Check toString() of each Payable_Objects ");
		for(int i = 0 ; i < 6; ++i){
			System.out.println(Payable_Objects[i]);
		}
		
		System.out.println("Output the Payment of each object");
		for(int i = 0 ; i < 6; i++){
			System.out.print(Payable_Objects[i].getClassName());
			System.out.print(" : ");
			System.out.println(Payable_Objects[i].getPaymentAmount());
		}
	}
}
