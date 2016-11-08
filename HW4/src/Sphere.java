
public class Sphere extends ThreeDimensionalShape{
	
	private double radius; 
	
	public Sphere(String shape_nam,double radius){
		super(shape_nam);
		this.radius = radius;
	}

	public double getRadius(){return this.radius;}
	
	@Override
	public double getArea(){
		return 4* Math.PI * this.getRadius() * this.getRadius(); 
	}
	@Override
	public double getVolume(){
		return this.getRadius() * this.getRadius() * this.getRadius() * Math.PI * 4/3 ;
	}
	
	@Override
	public void getInfo(){
		System.out.println("This class is Sphere ,is a ThreeDimensionalShap");
		System.out.println(String.format("The radius is %.5f",this.getRadius()));
	}
	
}
