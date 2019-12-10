
public class Pants extends Clothes{
	
	public void takeOff()
	{
		System.out.println("Taking these warm pants off is quite the process!:'(");
	}
	
	public void putOn()
	{
		System.out.println("Although they are tedious to put on, the warmth is so nice!");
	}
	
	public void modify() {
		System.out.println("Since they are now high waters, i'll cut them into shorts!");
	}
	
	public Pants(String c, String s, String n) {
		color= c;
		size =s;
		name= n;
	}


}
