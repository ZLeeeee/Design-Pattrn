import beverages.*;
import beverages.seasoning.Ice;
import beverages.seasoning.Milk;
import beverages.seasoning.Whip;

import java.io.InputStream;

public class Test {
	public static void main(String[] args) {
		InputStream
		Beverages beverages = new DarkRoast().setSeasoning(new Milk().setSeasoning(new Ice().setSeasoning(new Whip()))).setBeverages(new Mocha().setSeasoning(new Milk().setSeasoning(new Whip()))).setBeverages(new Decaf().setBeverages(new Mocha()));
		System.out.println("cost:"+beverages.getCost());
		System.out.println("description:"+beverages.getDescription());
	}
}
