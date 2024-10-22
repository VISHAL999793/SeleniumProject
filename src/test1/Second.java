package test1;

import java.util.Scanner;

public class Second {	
	public static void main(String[] args) {			
		Second sc = new Second();
		sc.Swap();
	}	
	void Swap()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = s.nextInt(); 
		int b = s.nextInt();		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
	}

}
