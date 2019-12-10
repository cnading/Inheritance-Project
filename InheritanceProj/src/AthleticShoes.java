
public class AthleticShoes extends Shoes{
	
	
	public void takeOff()
	{
		System.out.println("Wow! Those post workout feet are super smelly!");
	}
	
	public void putOn()
	{
		System.out.println("Ready to get after it in these high performing kicks!");
	}
	
	public void modify() {
		System.out.println("I'll paint some cool designs on them so I look cool when I work out.");
	}
	
	public AthleticShoes(String c, String s, String n) {
		color= c;
		size =s;
		name=n;
	}

}
