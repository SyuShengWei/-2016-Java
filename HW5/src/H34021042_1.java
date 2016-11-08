import java.util.Scanner;

public class H34021042_1 {

	public H34021042_1(){
		Scanner scanner = new Scanner(System.in);
		
		double BMI,hight,weight;
		
		int loop_control = 0;
		while (loop_control == 0){
			System.out.printf("Please input your height (cm):");
			hight = scanner.nextDouble();
			System.out.printf("Please input your weight (kg):");
			weight = scanner.nextDouble();
			try{
				BMI = BMIcounter(hight,weight);
				System.out.println(String.format("Your BMI is %.3f",BMI));
			}
			catch(BMIExcept b){
				System.out.println(b);
			}
			finally{
				System.out.print("Input 0 to continue ,else to exit :");
				loop_control = scanner.nextInt();
			}
			scanner.close();
		}
	}
	
	public double BMIcounter(double h, double w) throws BMIExcept{
		double bmi ;
		bmi = w / ((h/100)*(h/100));
		if(bmi > 24 || bmi < 18.5)
            throw new BMIExcept();
		return bmi;
	}
	
	static public void main(String args[]){
		new H34021042_1();
	} 
}


class BMIExcept extends Throwable{

	private static final long serialVersionUID = 1L;
	public BMIExcept(){}
	public String toString(){
		return "Except : BMI is outside of normal range!!";
	}
}