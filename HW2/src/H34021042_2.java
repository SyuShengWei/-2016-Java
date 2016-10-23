
public class H34021042_2 {

	public static void  main(String args[]){
		
		System.out.println("a)Output the time in multiple format :");
		fancyTime time1 = new fancyTime(23,59,59);
		time1.displayTime(1);
		time1.displayTime(2);
		time1.displayTime(3);
		System.out.println("b)Output the time in multiple format :");
		System.out.println("  1.Constructor receive three intergers and a string:");
		fancyTime time2 = new fancyTime(11,58,49,"a.m.");
		time2.displayTime(1);
		time2.displayTime(2);
		time2.displayTime(3);
		System.out.println("  2.Constructor receive three intergers:");
		fancyTime time3 = new fancyTime(11,58,49);
		time3.displayTime(1);
		time3.displayTime(2);
		time3.displayTime(3);
		System.out.println("  3.Constructor receive two intergers:");
		fancyTime time4 = new fancyTime(11,58);
		time4.displayTime(1);
		time4.displayTime(2);
		time4.displayTime(3);
		
	} 
}
