package test;
import first.livingthings;
import second.Tiger;
import third.Plants;
import first.Mobiles;
import second.Apple;
import second.Samsung;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		livingthings lv = new Plants();
		System.out.println(lv.breath());
		System.out.println(lv.eat());
		System.out.println(lv.life());
		
		livingthings t = new Tiger();
		System.out.println(t.breath());
		
		Mobiles mv = new Apple();
		System.out.println(mv.price());
		System.out.println(mv.memory());
		Mobiles v = new Samsung();
		System.out.println(v.price());
		System.out.println(v.memory());
		
		
		

	}

}
