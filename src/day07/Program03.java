package day07;

import java.util.Scanner;

public class Program03 {

	public static void main(String[] args) {
		Scanner x= new Scanner(System.in);
		System.out.println("Enter the Number:-  ");
		int a=x.nextInt();
		x.close();
		System.out.println("Start Program...!");

		if(a%2==0)
		{
			System.out.println("a is even..!");
		}
		else
		{
			System.out.println("a is odd..!");
		}

		System.out.println("End Program...!");

	}

}
