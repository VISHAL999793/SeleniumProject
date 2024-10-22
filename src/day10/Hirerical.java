package day10;

class F
{
	int n=10;
}
class C1 extends F
{
	void Loop1()
	{
		for(int i=1;i<n;i++)
		{
			System.out.println(i);
		}
	}
}
class C2 extends F
{
	void Loop2()
	{
		int i=1;
		while (i<n) {
			System.out.println(i);
			i++;
		}
	}
}

public class Hirerical {
	
	public static void main(String[] args) {
		C2 obj = new C2();
		obj.Loop2();
		
		C1 obj2  = new C1();
		obj2.Loop1();
	}

}
