
public class Runner {
	private String name;
	private int time;
	
	public Runner(String runner_name,int runner_time){
		this.name = runner_name;
		this.time = runner_time;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getTime(){
		return this.time;
	}
	
}
