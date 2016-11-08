
public class Cube extends ThreeDimensionalShape{
	
	private double length ;
	
	public Cube(String shape_name,double length){
		super(shape_name);
		this.length = length;
	}
	
	public double getLength(){return this.length;}
	
	@Override
	public double getArea(){
		return 6* this.getLength() *this.getLength(); 
		}
	@Override
	public double getVolume(){
		return this.getLength() *this.getLength() * this.getLength()  ;
		}
	
	@Override
	public void getInfo(){
		System.out.println("This class is Cube ,is a ThreeDimensionalShap");
		System.out.println(String.format("The length is %.5f",this.getLength()));
		}
	
}
