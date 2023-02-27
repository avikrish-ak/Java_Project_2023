package day13;

public class Program01 {

	public static void main(String[] args) {
		int[] x= new int[5];//0-4 index
		x[0] = 100;
		x[4] =300;
		x[2]= 400;

		System.out.println(x[0]);//100
		System.out.println(x[1]);//0
		System.out.println(x.length);
		System.out.println("Index loop");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("For- Each loop");
		for(int a:x)//100,0,400,0,300
		{
			System.out.println(a);
		}
		
		String[] name= { "abc","bcd","cde","def"};
		System.out.println(name.length);
		System.out.println(name[0]);//abc
		name[0]="ABC";
		System.out.println(name[0]);		
		
	}

}
