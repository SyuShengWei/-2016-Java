
abstract class Shape {
	
	private String shape_name ;
	
	public Shape(String shape_name) {
		this.shape_name = shape_name ;
	}

	public abstract void getInfo();
	public String getShape(){return this.shape_name;}
	
	public abstract double getArea();
	public abstract double getVolume();
}


abstract class TwoDimensionalShape extends Shape{
	
	public TwoDimensionalShape(String shape_name){
		super(shape_name);
	}
}


abstract class ThreeDimensionalShape extends Shape{
	
	public ThreeDimensionalShape(String shape_name){
		super(shape_name);
	}

}


