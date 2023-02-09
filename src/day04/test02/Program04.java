package day04.test02;

import day04.test01.Program01;

public class Program04 {

	public static void main(String[] args) {
		Program01 x= new Program01();
		x.addMethodNonStatic(10, 20);
		//x.mulMethodNonStatic(30, 20); //It's protected Method-not visible
	}

}
