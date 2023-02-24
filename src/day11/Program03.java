package day11;

public class Program03 {

	public static void main(String[] args) {
		/*
		 1
		 12
		 123
		 1234
		 12345
		 
		 12345
		 1234
		 123
		 12
		 1
		 */
		
		for(int i=1;i<=5;i++)//1 2 3 4 5
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
		}
		
		
		for(int i=5;i>=1;i--)//5 4 3 2 1
		{
		for(int j=1;j<=i;j++)
		{
			System.out.print(j);
		}
		System.out.println();
		}
		
		
	}

}
