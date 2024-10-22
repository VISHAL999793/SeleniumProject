package day14;
public class Exceptionwork {
	public static void main(String[] args)   {	
		Exceptionwork obj = new Exceptionwork();
		obj.M1();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		obj.M2();
	}	
	void M1()
	{
		int a = 5 , b=0;		
		try {		
				int c = a/b;		
				System.out.println(c);
			}
		catch (Exception e) {
			System.out.println(e);
		}
	}	
	void M2()
	{
		 // Taking an empty string
        String str = null;
        // Getting length of a string
        try {
        	System.out.println(str.length());
        }
        catch(Exception e)
        {
        	System.out.println(e);
        }
	}
}
