package day05.test01;

public class Program01 {

	public static void main(String[] args) {
		add(10,20);
		add(1.1,2.2);
		add(1,2,3);
		System.out.println(main(1,2));
		main();

	}
	
	public static int main(int a, int b)
	{
		return a+b;
	}
	
	public static void main()
	{
		System.out.println("Good Day..!");
	}
	
	public static void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public static void add(double a,double b)
	{
		System.out.println(a+b);
	}

	public static void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
}
