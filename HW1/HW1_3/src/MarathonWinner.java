import java.util.ArrayList;

public class MarathonWinner {
	
	public static void main(String args[]){
		
		ArrayList< Runner > Runner_List = new ArrayList< Runner >();
		
		Runner_List.add(new Runner("Elena"	 ,341));
		Runner_List.add(new Runner("Thomas"	 ,273));
		Runner_List.add(new Runner("Hamiltion",278));
		Runner_List.add(new Runner("Suzie"	 ,329));
		Runner_List.add(new Runner("Phil"	 ,445));
		Runner_List.add(new Runner("Matt"	 ,402));
		Runner_List.add(new Runner("Alex"	 ,388));
		Runner_List.add(new Runner("Emma"	 ,275));
		Runner_List.add(new Runner("John"	 ,243));
		Runner_List.add(new Runner("James"	 ,334));
		Runner_List.add(new Runner("Jane"	 ,412));
		Runner_List.add(new Runner("Emily"	 ,393));
		Runner_List.add(new Runner("Daniel"	 ,299));
		Runner_List.add(new Runner("Neda"	 ,343));
		Runner_List.add(new Runner("Aaron"	 ,317));
		Runner_List.add(new Runner("Kate"	 ,265));
		
		
		int i_sort , j_sort ;
		for (i_sort = 0 ;i_sort < Runner_List.size(); i_sort ++){
			Runner temp = new Runner(Runner_List.get(i_sort).getName() ,Runner_List.get(i_sort).getTime() );
			for (j_sort = i_sort-1 ; j_sort >=0 && Runner_List.get(j_sort).getTime() > temp.getTime();j_sort--){
				Runner_List.set(j_sort+1 , Runner_List.get(j_sort));
			}
			Runner_List.set(j_sort+1,temp);
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
		System.out.print(Runner_List.get(0).getName());
		System.out.print(" , ");
		System.out.println(Runner_List.get(0).getTime());
		
		System.out.print("Second runner : ");
		System.out.print(Runner_List.get(1).getName());
		System.out.print(" , ");
		System.out.println(Runner_List.get(1).getTime());
		
		System.out.print("Third  runner : ");
		System.out.print(Runner_List.get(2).getName());
		System.out.print(" , ");
		System.out.println(Runner_List.get(2).getTime());
	}
}