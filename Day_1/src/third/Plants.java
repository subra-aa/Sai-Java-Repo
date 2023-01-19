package third;
import first.livingthings;

public class Plants extends livingthings{

	@Override
	public String eat() {
		
		return "Plants cannot eat";
	}

	@Override
	public String life() {

		return "Plants can live upto 10 years";
	}
	
	

}
