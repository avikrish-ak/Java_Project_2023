package day06;

public class Program03 {

	public static void main(String[] args) {
		// && || !
		int a=100;
		int b=20;
		int c=30;
		
		System.out.println((a>b) && (a>c));//t
		System.out.println((b>a) && (b>c));//f
		System.out.println((c>a) && (c>b));//f
		System.out.println("**********************");
		System.out.println((a>b) || (a>c));//t
		System.out.println((b>a) || (b>c));//f
		System.out.println((c>a) || (c>b));//t
		System.out.println("**********************");
		System.out.println(!(a>b));//f
		System.out.println(!(b>c));//t
	}

}
