package day9;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value");
		int a = sc.nextInt();
		int b = sc.nextInt();		
		Logic obj = new Logic();
		int output = obj.Add(a,b);
		System.out.println(output + 90);		
		obj.Sub(a, b);
	}
}

