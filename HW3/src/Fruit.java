
public class Fruit extends Object{
	private String shape;
	private String color;
	private int calories;
	
	public Fruit (String the_shape ,String the_color , int the_calories){
		this.shape = the_shape;
		this.color = the_color;
		this.calories = the_calories;
	}
	
	public String getShape(){return this.shape;}
	
	public String getColor(){return this.color;}
	
	public int getCalories(){return this.calories;}
	
	@Override
	public String toString(){
		return String.format("Fruit%n%s : %s%n%s : %s%n%s : %d",
				"Shape",this.shape,
				"Color",this.color,
				"Calories",this.calories);
	}
}
