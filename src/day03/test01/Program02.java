package day03.test01;

public class Program02 extends Program01{
	//Program01- super class(parent)
	//Program02- sub class(child)
	public static void main(String[] args) {
		Program02 xyz= new Program02(); 
		xyz.addMethod(10, 20);
		subMethod(20, 10);
		mulMethod(20, 30);
	}

}
