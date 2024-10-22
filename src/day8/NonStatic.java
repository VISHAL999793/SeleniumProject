package day8;

public class NonStatic {

	int a = 10 , b=20;

	public static void main(String[] args) {		
		
		NonStatic obj = new NonStatic();
		obj.A();
	}
	
	void A()
	{
		System.out.println(a<b);
	}

}
