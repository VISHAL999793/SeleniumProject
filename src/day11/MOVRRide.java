package day11;
class P
{
	void Anuj()
	{
		System.out.println("Parent");
	}
}

class C extends P
{
	void Anuj()
	{
		super.Anuj();
		System.out.println("Child");
	}
}

public class MOVRRide {
	public static void main(String[] args) {		
		 C  obj = new C();
		 obj.Anuj();
	}

}
