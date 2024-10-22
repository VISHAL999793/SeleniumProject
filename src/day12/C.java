package day12;

public class C implements I {

	public static void main(String[] args) {		
		C obj = new C();
		obj.A();
	}

	@Override
	public void A() {
		System.out.println("Hello");	
	}
}
