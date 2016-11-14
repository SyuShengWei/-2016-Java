import java.io.IOException;

public class H34021042_2 {
	
	public static void main(String[] args){
		
		try{
			System.out.println("Throw ExceptionA");
			throw new ExceptionA_2();
		}
		catch(Exception e){
			System.out.printf("%s:%s\n","Catch ",e);
		}
		
		try{
			System.out.println("Throw ExceptionB");
			throw new ExceptionB_2();
		}
		catch(Exception e){
			System.out.printf("%s:%s\n","Catch ",e);
		}
		
		try{
			System.out.println("Throw NullPointerException");
			throw new NullPointerException();
		}
		catch(Exception e){
			System.out.printf("%s:%s\n","Catch ",e);
		}
		
		try{
			System.out.println("Throw IOException");
			throw new IOException();
		}
		catch(Exception e){
			System.out.printf("%s:%s\n","Catch ",e);
		}
		
		
	}
}

class ExceptionA_2 extends Exception{
	
	public ExceptionA_2(){}

	@Override
	public String toString(){
		return "ExceptionA";
	}
}

class ExceptionB_2 extends ExceptionA_2{
	
	public ExceptionB_2(){}

	@Override
	public String toString(){
		return "ExceptionA";
	}
}

