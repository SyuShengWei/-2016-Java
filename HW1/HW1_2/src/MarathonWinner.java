
public class MarathonWinner {
	
	public static void main(String args[]){
		Runner runner_1  = new Runner("Elena"	 ,341);
		Runner runner_2  = new Runner("Thomas"	 ,273);
		Runner runner_3  = new Runner("Hamiltion",278);
		Runner runner_4  = new Runner("Suzie"	 ,329);
		Runner runner_5  = new Runner("Phil"	 ,445);
		Runner runner_6  = new Runner("Matt"	 ,402);
		Runner runner_7  = new Runner("Alex"	 ,388);
		Runner runner_8  = new Runner("Emma"	 ,275);
		Runner runner_9  = new Runner("John"	 ,243);
		Runner runner_10 = new Runner("James"	 ,334);
		Runner runner_11 = new Runner("Jane"	 ,412);
		Runner runner_12 = new Runner("Emily"	 ,393);
		Runner runner_13 = new Runner("Daniel"	 ,299);
		Runner runner_14 = new Runner("Neda"	 ,343);
		Runner runner_15 = new Runner("Aaron"	 ,317);
		Runner runner_16 = new Runner("Kate"	 ,265);
		
		Runner Runner_Array[] = {runner_1,runner_2,runner_3,runner_4,runner_5,runner_6,
					runner_7,runner_8,runner_9,runner_10,runner_11,runner_12,runner_13,runner_14,runner_15,runner_16};
		int i_sort , j_sort ;
		for (i_sort = 0 ;i_sort < Runner_Array.length; i_sort ++){
			Runner temp = new Runner(Runner_Array[i_sort].getName() ,Runner_Array[i_sort].getTime() );
			for (j_sort = i_sort-1 ; j_sort >=0 && Runner_Array[j_sort].getTime() > temp.getTime();j_sort--){
				Runner_Array[j_sort+1] = Runner_Array[j_sort];
			}
			Runner_Array[j_sort+1] = temp;
		}
		/* print all runner (after sorted)
		for (int i = 0 ; i < Runner_Array.length ; i ++){
			System.out.print(Runner_Array[i].getName());
			System.out.print(" , ");
			System.out.print(Runner_Array[i].getTime());
			System.out.print("\n");
		}
		*/
		System.out.print("First  runner : ");
		System.out.print(Runner_Array[0].getName());
		System.out.print(" , ");
		System.out.println(Runner_Array[0].getTime());
		
		System.out.print("Second runner : ");
		System.out.print(Runner_Array[1].getName());
		System.out.print(" , ");
		System.out.println(Runner_Array[1].getTime());
		
		System.out.print("Third  runner : ");
		System.out.print(Runner_Array[2].getName());
		System.out.print(" , ");
		System.out.println(Runner_Array[2].getTime());
	}
}