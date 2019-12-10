
public class Shirts extends Clothes {
	
	
	public void takeOff()
	{
		System.out.println("When its hot out its awfuly nice to take this off!");
	}
	
	public void putOn()
	{
		System.out.println("Gotta put on a " + name + "no matter where I'm going.");
	}
	
	public void modify() {
		System.out.println("Maybe I'll cut the sleeves off and make it a bro tank...");
	}
	
	public Shirts(String c, String s, String n) {
		color= c;
		size =s;
		name= n;
	}


}
