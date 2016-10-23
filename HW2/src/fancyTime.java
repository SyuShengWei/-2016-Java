
public class fancyTime {
	
	private int hour ;
	private int minute;
	private int second;
	private String meridiem;
	
	public fancyTime(){
		this.hour = 0;
		this.minute = 0;
		this.second = 0;
		this.meridiem = "" ; 
	}
	
	public fancyTime(int the_hour,int the_minute,int the_second){	
		if (the_hour > 24||the_hour < 0)
			throw new IllegalArgumentException("Hour is out of range");
		else
			this.hour = the_hour;
		
		if (the_minute > 60||the_minute < 0)
			throw new IllegalArgumentException("Minute is out of range");
		else
			this.minute = the_minute;
		
		if (the_second > 60||the_second < 0)
			throw new IllegalArgumentException("Second is out of range");
		else
			this.second = the_second;
		
	}
	
	public fancyTime(int the_hour, int the_minute){
		this(the_hour,the_minute,0);
	}
	
	public fancyTime(int the_hour, int the_minute ,int the_second ,String apm){
		this(the_hour,the_minute,the_second);
		if (the_hour >12 || the_hour < 0 )
			throw new IllegalArgumentException("Hour is out of range");
		if (apm == "a.m." || apm == "p.m.") {this.meridiem = apm;}
		else
			throw new IllegalArgumentException("Meridiem is not a.m. or p.m. ");				
	}
	
	public void displayTime (int i){
		if (i == 1)
			System.out.println(this.hourFormat12());
		if (i == 2)
			System.out.println(this.hourFormat24());
		if (i == 2)
			System.out.println(this.hourFormat24_short());	
	}
	
	public int getHour(){return this.hour;}
	
	public int getMinute(){return this.minute;}
	
	public int getSecond(){return this.second;}
	
	public String getMeridiem(){return this.meridiem;} 
	
	public String hourFormat12(){
		int out_hour = this.getHour();
		String out_meridiem ; 
		
		//24hr
		if(this.getHour() >12  ){
			if (this.getHour() == 24)
				out_meridiem ="a.m."; 
			else
				out_meridiem = "p.m.";
				out_hour -= 12;
		}
	
		else if(this.getHour() < 12){
			out_meridiem = "a.m.";
		}
		else{
			if (this.getMeridiem() == "")
				out_meridiem = "p.m.";
			else
				out_meridiem = "a.m";
		}
		
		
		return String.format("%2d:%2d:%2d %5s",out_hour,this.minute,this.second,out_meridiem);
	}
	
	public String hourFormat24(){
		int time_hour = (this.meridiem == "p.m." && this.hour != 12) ? this.hour + 12 : this.hour ;
			
		return String.format("%2d:%2d:%2d",time_hour,this.minute,this.second);
	}
	
	public String hourFormat24_short(){
		int time_hour = (this.meridiem == "p.m."&& this.hour != 12) ? this.hour + 12 : this.hour ;
		
		return String.format("%2d:%2d",time_hour,this.minute);
	}
}
