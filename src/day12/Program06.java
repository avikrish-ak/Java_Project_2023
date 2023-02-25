package day12;

public class Program06 {

	public static void main(String[] args) {

		/*
		0
		1 1 
		2 3 5 
		8 13 21 34 
		55 89 144 233 377
		 */
		
		int x=0;
		int y=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(x+"\t");
			int z=x+y;
			x=y;
			y=z;
			}
			System.out.println();
		}
		
	}

}
