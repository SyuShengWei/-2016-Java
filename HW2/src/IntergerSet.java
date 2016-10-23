
public class IntergerSet {
	
	private boolean[] the_set = new boolean[101];
	
	
	public IntergerSet(){
		for (int i = 0 ; i <101 ; ++i){
			this.the_set[i] = false;
		}		
	}

	public IntergerSet(boolean[] a_set_of_interger){
		this.the_set = a_set_of_interger;		
	}
	
	public IntergerSet(int interger ){
		for (int i = 0 ; i <101 ; ++i){
			this.the_set[i] = false;
		}
		this.the_set[interger] = true;
	}
	
	public IntergerSet(IntergerSet the_intergerset){
		this.the_set = the_intergerset.getthe_set();
	}
	
	public static IntergerSet union(IntergerSet s1,IntergerSet s2){
		boolean set1[] = s1.getthe_set();
		boolean set2[] = s2.getthe_set();
		boolean union_set[] = new boolean[101];
		
		for (int i = 0 ; i <101 ; ++i){
			if (set1[i] == true || set2[i] == true){
				union_set[i] = true ;
			}
			else{
				union_set[i] = false;
			}
		}
		
		IntergerSet union = new IntergerSet(union_set);
		return union;
	}
	
	public static IntergerSet intersection(IntergerSet s1,IntergerSet s2){
		boolean set1[] = s1.getthe_set();
		boolean set2[] = s2.getthe_set();
		boolean inter_set[] = new boolean[101];
		
		for (int i = 0 ; i <101 ; ++i){
			if (set1[i] == true && set2[i] == true){
				inter_set[i] = true ;
			}
			else{
				inter_set[i] = false;
			}
		}
		
		IntergerSet intersection = new IntergerSet(inter_set);
		return intersection;
	}	
	
	public static boolean isEqualTo(IntergerSet s1,IntergerSet s2){
		boolean[] set1 = s1.getthe_set();
		boolean[] set2 = s2.getthe_set();
		
		for (int i = 0 ; i < 101 ; ++i){
			if (set1[i] != set2[i]){return false;}
		}
		return true;
	}
	
	
	public boolean[] getthe_set(){
		return this.the_set ; 
	}
	
	public void insertElement(int element){ 
		if (element <= 100 ||element >= 0){
			this.the_set[element] = true;
		}
		else{
			System.out.println("Interger out of range.");
		}
	}
	
	public void deleteElement(int element){
		if (element <= 100 ||element >= 0){
			this.the_set[element] = false;
		}
	}
	
	public String toString(){
		String out_string = "";
		for (int i = 0 ; i <101 ; ++i){
			if (this.the_set[i] == true){
				out_string += String.valueOf(i);
				out_string += " ";
			}
		}
		
		if (out_string == ""){
			out_string = "---";
		}
		
		return out_string;
	}
	


}
