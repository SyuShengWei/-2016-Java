
public class H34021042_hw1 {
	public static void main(String args[]){
		Shape[] array = new Shape[4]; 
		array[0] = new Circle("Circle",10);
		array[1] = new Square("Square",10);
		array[2] = new Sphere("Sphere",10);
		array[3] = new Cube("Cube",10);
		
		
		for (int i = 0 ; i < 4 ; ++i){
			if (array[i].getClass().getSuperclass().equals(TwoDimensionalShape.class)){
				array[i].getInfo();
				System.out.print("Area : ");
				System.out.println(array[i].getArea());
			}
			else if (array[i].getClass().getSuperclass().equals(ThreeDimensionalShape.class)){
				array[i].getInfo();
				System.out.print("Area : ");
				System.out.println(array[i].getArea());
				System.out.print("Volume : ");
				System.out.println(array[i].getVolume());
			}
		}
	}
}
