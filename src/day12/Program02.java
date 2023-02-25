package day12;

public class Program02 {

	public static void main(String[] args) {


		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)//j=1, j=2, j=3, j=4,j=5
			{
				if(j%2==1)
				{
					System.out.print(i+"\t");
				}
				else
				{
					System.out.print(i*i+"\t");
				}
			}
			System.out.println();
		}

	}

}
