package day5;
public class A {	
	public static void main(String[] args) {		
		int a = 10 , b=30 , c=90;		
		if(a<b || b>c)    //(10<30 (T) + 30>90 (F))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
}
