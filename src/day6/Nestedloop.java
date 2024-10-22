package day6;

public class Nestedloop {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=3;i++)
		{			
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
}

//i=2;2<=3;3

//j=1;4<=3;4