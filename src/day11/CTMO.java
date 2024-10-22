package day11;
public class CTMO {	
		
	void Anuj()
	{
		System.out.println("Method Overloading");
	}	
	void Anuj(int a)
	{
		System.out.println(a);
	}
	void Anuj(int a , int b)
	{
		System.out.println(a+b);
	}
	public static void main(String[] args) {		
		CTMO obj = new CTMO();
		obj.Anuj();
		obj.Anuj(10);
		obj.Anuj(10, 20);
	}
}
