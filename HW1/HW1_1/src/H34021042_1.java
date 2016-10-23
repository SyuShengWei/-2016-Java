import java.util.Scanner;

public class H34021042_1 {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int array[] = new int[10];
		
		//initialize array
		for (int i = 0 ; i < array.length ;i ++){
			array[i] = -1 ;
		} 
		
		System.out.print("Initialized array : ");
		for (int i = 0 ; i < array.length ;i ++){
			System.out.print(array[i]);
			if (i != 9) { System.out.print(" , "); }
		} 
		System.out.print("\n");
		
		//input num
		for (int i = 0 ; i < array.length ;i ++){
			int input_num = scanner.nextInt();
			if(input_num < 10 ||input_num >100){
				i--;
				System.out.println("Wrong input,please try again!");
			}
			else array[i] = input_num;
		}
		
		System.out.print("Original input array : ");
		for (int i = 0 ; i < array.length ;i ++){
			System.out.print(array[i]);
			if (i != 9) { System.out.print(" , "); }
		} 
		System.out.print("\n");
		
		//deal with duplicate elements
		for (int i = 0 ; i < array.length ;i ++){
			if (array[i] == -1){continue;}
			for (int j = i+1 ; j < array.length ; j++){
				if (array[j] == -1){continue;}
				else if(array[i] == array[j]){
					array[j] = -1;
				}
			}
		}
		System.out.print("After remove duplication ,array : ");
		for (int i = 0 ; i < array.length ;i ++){
			if(array[i] == -1) {continue;}
			else  {
				System.out.print(array[i]);
				if (i != 9) { System.out.print(" , ");
				} 
			}
		} 
		System.out.print("\n");
		
		scanner.close();
	}
}
