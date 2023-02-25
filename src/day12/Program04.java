package day12;

public class Program04 {

	public static void main(String[] args) {

		int temp=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
					System.out.print(temp+"\t");
					temp++;
			}
			System.out.println();
		}

	}

}
