import javax.swing.JOptionPane;

public class H34021042_3 {

	public H34021042_3(){
		double BMI;
		String hight_s,weight_s;
		double hight,weight;
		
		
		int loop_control = 0;
		while (loop_control == 0){
			hight_s = JOptionPane.showInputDialog("Please input your height (cm):");
			weight_s = JOptionPane.showInputDialog("Please input your weight (kg):");
			hight = Double.parseDouble(hight_s);
			weight = Double.parseDouble(weight_s);
	
			try{
				
				BMI = BMIcounter(hight,weight);
				JOptionPane.showMessageDialog(null,String.format("Your BMI is %.3f",BMI),"BMI result66", JOptionPane.PLAIN_MESSAGE);
			}
			catch(BMIExcept b){
				JOptionPane.showMessageDialog(null, b, "BMI Out Of Normal Range", JOptionPane.PLAIN_MESSAGE);
			}
			finally{
				loop_control = Integer.parseInt(JOptionPane.showInputDialog("Input 0 to continue ,else to exit :"));
			}
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
		new H34021042_3();
	} 
}


class BMIExcept extends Throwable{

	private static final long serialVersionUID = 1L;
	public BMIExcept(){}
	public String toString(){
		return "Except : BMI is outside of normal range!!";
	}
}