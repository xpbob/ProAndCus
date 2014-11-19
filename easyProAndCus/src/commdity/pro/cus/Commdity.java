package commdity.pro.cus;

public class Commdity {
	private String name;
	public static int num=6;
	public static int count=0;
	public static Commdity com[]=new Commdity[num];//´æ·ÅµÄ²Ö¿â
	
	public Commdity(String name)
	{
		this.name=name;
		
		
	}
	public String getName() {
		return name;
	}

}


