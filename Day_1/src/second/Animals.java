package second;
import first.livingthings;
public abstract class Animals extends livingthings {
	

	public String eat() {
		return"Animals Eat";
	}
	
	public String life() {
		return"Animals can live upto 20years";
	}
	
	public abstract String wildAnimal();
	
}
