package day10;

public class Program04 {

	public static void main(String[] args) {
		int n=10;
		System.out.println("----While Program----");
		int a=1;
		int temp=1;
		while(a<=n)
		{
			temp=temp*a;
			System.out.println(a+"    "+temp);
			a=a+1;
		}
		
		System.out.println("----Do- While Program----");
		int b=1;
		temp=1;
		do
		{
			temp=temp*b;
			System.out.println(b+"    "+temp);
			b=b+1;
		}while(b<=n);
		
		System.out.println("----For Program----");
		temp=1;
		for(int c=1;c<=n;c=c+1)
		{
			temp=temp*c;
			System.out.println(c+"    "+temp);
		}
		
	}

}
