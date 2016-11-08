
public class Square extends TwoDimensionalShape{
	
	private double length;
	
	public Square(String shape_name,double length){
		super(shape_name);
		this.length = length;
	}
	
	public double getLength(){return this.length;}
	
	@Override
	public double getArea(){
		return (this.getLength() * this.getLength()) ; 
		}
	@Override
	public double getVolume(){
		return 0.0;
		}
	@Override
	public void getInfo(){
		System.out.println("This class is Square ,is a TwoDimensionalShap");
		System.out.println(String.format("The length is %.5f",this.getLength()));
		}
	
}
