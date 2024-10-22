package day8;

import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		
		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a value"); int
		 * n=sc.nextInt();
		 */
		
		A obj = new A();
		obj.Loop(10);  //
	}

	void Loop(int n)
	{
		for(int i=1;i<=n;i++)
		{
			for(int j=1; j<=n;j++)
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
}
