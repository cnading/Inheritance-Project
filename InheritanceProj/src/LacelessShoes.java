
public  class LacelessShoes extends Shoes {

	
	public void takeOff()
	{
		System.out.println("Nothing but a smooth day of relaxing done.");
	}
	
	public void putOn()
	{
		System.out.println("Looking forward to a not so active day.");
	}
	
	public void modify() {
		System.out.println("I might just have to rock some socks!");
	}
	
	public LacelessShoes(String c, String s, String n) {
		color= c;
		size =s;
		name=n;
	}
}
