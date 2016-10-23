
public class Orange extends Fruit{
	
	public Orange(){
		super("Cycle","Orange",576);
	}
	
	@Override
	public String toString(){
		return String.format("Orange%n%s : %s%n%s : %s%n%s : %d",
				"Shape",super.getShape(),
				"Color",super.getColor(),
				"Calories",super.getCalories());
	}
}
