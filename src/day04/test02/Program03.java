package day04.test02;

import day04.test01.Program01;

public class Program03 extends Program01{

	public static void main(String[] args) {
		addMethod(10, 10);
		//subMethod(20, 10); //It's Private Method-not visible
		mulMethod(3, 2);
		//sqrtMethod(10); //It's default Method-not visible
		Program03 x= new Program03();//current class object
		x.addMethodNonStatic(100, 10);
		//x.subMethodNonStatic(20, 5); //It's Private Method-not visible
		x.mulMethodNonStatic(30, 20);
		//x.sqrtMethodNonStatic(4); //It's default Method-not visible
		

	}

}
