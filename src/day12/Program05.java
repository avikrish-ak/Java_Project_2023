package day12;

public class Program05 {

	public static void main(String[] args) {

		/*
		0 1 1 2 3 5 8 13 21 34 55 89 144 233 377
		 */
		int x=0;
		int y=1;
		for(int i=1;i<=15;i++)
		{
			
			System.out.println(x);
			int z=x+y;
			x=y;
			y=z;
		}

	}

}
