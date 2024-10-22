package day12;
//class name and const method name both are same
public class A {	
	 A()
	 {
		 System.out.println("Hello");
	 }		 
	 A(int a, int b)
	 {
		 if(a<b)
		 {
			 System.out.println(true);
		 }
		 else
		 {
			 System.out.println(false);
		 }		 
	 }		 
	 public static void main(String[] args) {		
		 A obj = new A();
		 A obj2 = new A(10,90);
	}
}
