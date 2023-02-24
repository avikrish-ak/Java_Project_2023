package day11;

public class Program01 {

	public static void main(String[] args) {
		int a=1;
		//a++, ++a  ---> a=a+1
		System.out.println(a);
		int b= a++;//b=1,a=2
		System.out.println(b+"   "+a);
		int c=++a;//a=3,c=3
		System.out.println(c+"   "+a);
		
		//a=3
		//a--,--a --->a=a-1
		int d=a--;//d=3,a=2
		System.out.println(d+"   "+a);
		int e=--a;//e=1,a=1
		System.out.println(e+"   "+a);

	}

}
