package day7;
//user define method using static 
//dynamic 

public class Addvalue {	
	
	public static void main(String[] args) {		
		Addvalue obj = new Addvalue();
		obj.Loop();				
	}	
		
	/*
	 * void Add() { int a = 10 , b=20 , c=0; c = a; a = b; b = c;
	 * System.out.println(a); System.out.println(b); }
	 */
	
	
	void Loop()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}			
			System.out.println();
		}
	}
	
}
