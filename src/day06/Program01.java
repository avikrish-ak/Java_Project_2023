package day06;

import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		// + - * /(Q)  %(R) Numbers
		Scanner x= new Scanner(System.in);
		System.out.println("Enter Int Value of a:- ");
		int a=x.nextInt();
		System.out.println("Enter Int Value of b:- ");
		int b=x.nextInt();
		
		System.out.println("Enter Double Value of c:- ");
		double c=x.nextDouble();
		x.close();
		// int () int--->int
		//int () double/float---> double/float
		
		System.out.println(a+b);
		System.out.println(a+c);
		
		System.out.println(a-b);
		System.out.println(a-c);
		
		System.out.println(a*b);
		System.out.println(a*c);
		
		System.out.println(a/b);
		System.out.println(a/c);
		
		System.out.println(a%b);
		System.out.println(a%c);

	}

}
