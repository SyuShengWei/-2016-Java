
public class H34021042_1 {
	
	public static void main(String args[]){
		System.out.println("IS1 = {} ,IS2 = {10,13}");
		IntergerSet IS1 = new IntergerSet();
		IntergerSet IS2 = new IntergerSet(10);
		IS2.insertElement(13);
		
		System.out.println("1.toString():");
		System.out.print("a.without any element : ");
		System.out.println(IS1);
		System.out.print("b.with  element : ");
		System.out.println(IS2);
		System.out.println("2.insertElement():");
		System.out.println("  insert 0 , 10 , 11 into IS1");
		IS1.insertElement(0);
		IS1.insertElement(10);
		IS1.insertElement(11);
		System.out.println(IS1);
		System.out.println("3.deleteElement():");
		System.out.println("  delete  11 from IS1");
		IS1.deleteElement(11);
		System.out.println(IS1);
		System.out.println("4.union():");
		System.out.println("IS1 = {0,10} ,IS2 = {10,13}");
		IntergerSet union = IntergerSet.union(IS1,IS2);
		System.out.println(union);
		System.out.println("5.intersection():");
		System.out.println("IS1 = {0,10} ,IS2 = {10,13}");
		IntergerSet intersection = IntergerSet.intersection(IS1,IS2);
		System.out.println(intersection);
		System.out.println("6.isEqualTo():");
		System.out.println("IS1 = {0,10} ,IS2 = {10,13}");
		System.out.println(IntergerSet.isEqualTo(IS1,IS2));
		System.out.println("IS1 = {0,10} ,IS3 = {0,10}");
		IntergerSet IS3 = new IntergerSet(10);
		IS3.insertElement(0);
		System.out.println(IntergerSet.isEqualTo(IS1,IS3));
	}
}
