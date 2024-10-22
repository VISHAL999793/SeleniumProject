package day8;

public class Localvariable {
	
	static int a = 10 , b=20;

	public static void main(String[] args) {		
		
		System.out.println(a<b);
		
		A();
	}
	
	static void A()
	{
		System.out.println(a<b);
	}
	
}
