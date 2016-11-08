import java.util.Random;

public class H34021042_2 {
	
	static public void main(String arg[]){
		Dog mydog = new Dog();
		int loop_control = 0;
		while(loop_control < 10){
			try{
				mydog.DogState();
				System.out.println("Dog is not hungry");
			}
			catch (HungryExcept h){
				System.out.println(h);
			}
			finally{
				loop_control +=1;	
			}
		}
	}
}


class Dog{
	
	
	public Dog(){}
	
	public int DogState() throws HungryExcept {
		Random random_num = new Random();
		int state ;
		state = random_num.nextInt(10);
		if (state == 0)
			throw new HungryExcept();
		else
			return state;
	} 
}




class HungryExcept extends Throwable{
	
	private static final long serialVersionUID = 5484909784971525775L;

	public HungryExcept(){}
	
	@Override
	public String toString(){
		return "Dog is hungry";
	}
}