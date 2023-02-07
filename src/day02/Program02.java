package day02;

public class Program02{

	
	public static int fun()
	{
		int x=10;
		System.out.println(x*x);
		return x*x;
	}

	
	public static void main(String[] args) {
		long a=fun();//64,32//100.0
		System.out.println(a+a);//200.0
	}
	
}
