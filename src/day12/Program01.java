package day12;

public class Program01 {

	public static void main(String[] args) {


		for(int i=1;i<=5;i++)//i=5
		{
			boolean x=true;
			for(int j=1;j<=i;j++)//j=1, j=2, j=3, j=4,j=5
			{
				if(x)
				{
					System.out.print(i+"\t");//5
					x=false;
				}
				else
				{
					System.out.print(i*i+"\t");// 25
					x=true;
				}

			}
			System.out.println();
		}

	}

}
