
public class H34021042_1 {
	public static void main(String args[]){
		try{
			System.out.println("Try Throw ExcptionB Use ExceptionA to catch");
			throw new ExceptionB();
			
		}
		catch(ExceptionA a){
			System.out.printf("%s:%s\n","Catch ",a);
		}
		
		try{
			System.out.println("Try Throw ExcptionC Use ExceptionA to catch");
			throw new ExceptionC();
			
		}
		catch(ExceptionA a){
			System.out.printf("%s:%s\n","Catch ",a);
		}
	}
}

 class ExceptionA extends Throwable{
	
	public ExceptionA(){}
	
	@Override
	public String toString(){
		return "Exception A";
	}
}

class ExceptionB extends ExceptionA{
		
	public ExceptionB(){}
		
	@Override
	public String toString(){
		return "Exception B" ;
	}
}

class ExceptionC extends ExceptionB{
	
	public ExceptionC(){}
	
	@Override
	public String toString(){
		return "Exception C" ;
	}
}


