package day10;

class GP
{
	int a=10,b=30;	
}

class P extends GP
{
	void C1()
	{
		System.out.println(a>=b);
	}
}
public class Child extends P {	
	void C2()
	{
		System.out.println(a!=b);
	}	
	public static void main(String[] args) {		
		Child obj = new Child();
		obj.C1();
		obj.C2();		
	}
}
