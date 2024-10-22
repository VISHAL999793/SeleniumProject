package day13;

//local var | global 
public class Refrenename {	
	
	int a;
	String name;
	
	Refrenename(int a , String name)
	{
		this.a = a;
		this.name = name;
	}	
	
	void A()
	{
		System.out.println(a);
		System.out.println(name);
	}
	public static void main(String[] args) {		
		Refrenename obj = new Refrenename(10 , "Ram");
		obj.A();
	}

}
