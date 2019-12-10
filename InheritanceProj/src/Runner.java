import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		dataDump();

	}

	private static void dataDump() {
		System.out.println("My Closet:");
		System.out.println("");
		ArrayList<Clothes> closet = new ArrayList<Clothes>();
		
		Shirts sweatShirt = new Shirts("Black", "Large", "Long Sleeved UnderArmour Sweatshirt" );
		closet.add(sweatShirt);
		Shirts buttonDown = new Shirts("Red and White", "Medium", "Short Sleeved Button Down");
		closet.add(buttonDown);
		Shirts jacket = new Shirts("Forest Green", "Medium", "Long Sleeved Jacket");
		closet.add(jacket);
		Shirts polo = new Shirts("White", "Small", "Short Sleeved Polo");
		closet.add(polo);
		
		Pants jeans = new Pants("Navy", "Large", "Levi Jeans");
		closet.add(jeans);
		Pants khakis = new Pants("Tan", "Medium", "LandsEnd Khakis");
		closet.add(khakis);
		Pants sweatPants = new Pants("Forest Green", "Medium", "Nike SweatPants");
		closet.add(sweatPants);
		Pants leggings = new Pants("Black", "Small", "LuLu Lemon Leggings");
		closet.add(leggings);
		
		AthleticShoes ultraBoost = new AthleticShoes("Black", "10", "Addidas UltraBoost");
		closet.add(ultraBoost);
		AthleticShoes nMDs = new AthleticShoes("Red and White", "8", "Addidas NMDs");
		closet.add(nMDs);
		AthleticShoes mensAfterburn = new AthleticShoes("Brown", "11", "Sketchers MensAfterburn");
		closet.add(mensAfterburn);
		AthleticShoes womensGhost11 = new AthleticShoes("teele", "6", "Brooks WomensGhost11");
		closet.add(womensGhost11);
		
		LacelessShoes berkenstocks = new LacelessShoes("Brown", "7", "berkenstocks");
		closet.add(berkenstocks);
		LacelessShoes crocks = new LacelessShoes("Red and White", "8", "crocks");
		closet.add(crocks);
		LacelessShoes flipflops = new LacelessShoes("Brown", "11", "Olukai flipflops");
		closet.add(flipflops);

		for (Clothes c: closet)
		{
		
			System.out.println(c.color + " " + c.name);
			System.out.println("Size: "+ c.size);
			c.putOn();
			c.takeOff();
			c.modify();
			System.out.println("");
			
			
		}	
		
	}

}
