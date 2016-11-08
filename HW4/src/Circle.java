
public class Circle extends TwoDimensionalShape{
	
	private double radius;
	
	public Circle(String shape_name,float radius){
		super(shape_name);
		this.radius = radius; 
	}
	
	double getRadius(){return this.radius;}
	@Override
	public double getArea(){
		return this.getRadius() * this.getRadius() * Math.PI; 
		}
	public double getVolume(){
		return 0.0;
		}
	@Override
	public void getInfo(){
		System.out.println("This class is Circle ,is a TwoDimensionalShap");
		System.out.println(String.format("The radius is %.5f",this.getRadius()));
	}
}
