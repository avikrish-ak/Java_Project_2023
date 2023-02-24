package day11;

public class Program04 {

	public static void main(String[] args) {
		/*
		 54321
		 4321
		 321
		 21
		 1
		 
		 1
		 21 
		 321
		 4321
		 54321
		 
		 */
		
		for(int i=5;i>=1;i--)// 5 4 3 2 1
		{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println();
		}
		
		
		for(int i=1;i<=5;i++)// 1 2 3 4 5
		{
		for(int j=i;j>=1;j--)
		{
			System.out.print(j);
		}
		System.out.println();
		}
		
		
	}

}
