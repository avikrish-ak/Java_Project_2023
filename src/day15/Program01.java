package day15;

import java.util.ArrayList;
import java.util.Arrays;

public class Program01 {

	public static void main(String[] args) {
	
		ArrayList<Integer> x= new ArrayList<>();
		x.add(10);//0
		x.add(30);//1
		x.add(20);//2
		x.add(40);//3
		System.out.println(x);
		System.out.println(x.get(2));
		x.add(10);//4
		x.add(30);//5
		x.add(20);//6
		x.add(40);//7
		System.out.println(x);
		
		x.remove(7);
		System.out.println(x);
		x.remove(6);
		System.out.println(x);
		x.remove(5);
		System.out.println(x);
		x.remove(4);
		System.out.println(x);
		System.out.println(x.size());
		System.out.println(x.get(0));
		x.remove(0);
		System.out.println(x.get(0));
		
		Integer[] y= {30,50,60,10,70,90,80,30};
		x.addAll(Arrays.asList(y));
		System.out.println(x);
		
		Integer[] z= {30,90,66};
		x.removeAll(Arrays.asList(z));
		System.out.println(x);
		
		System.out.println(x.contains(60));//true/false
		System.out.println(x.contains(600));
		
		Integer[] a1= {10,20,40};
		System.out.println(x.containsAll(Arrays.asList(a1)));//true
		
		Integer[] a2= {10,20,30,40};
		System.out.println(x.containsAll(Arrays.asList(a2)));//false
		
		System.out.println(x);
		//[20, 40, 50, 60, 10, 70, 80]
		x.add(2, 66);
		System.out.println(x);
		
		x.set(2, 666);
		System.out.println(x);
		
		System.out.println(x.isEmpty());//false
		
		x.clear();
		System.out.println(x);
		System.out.println(x.isEmpty());//true
		
		
	}

}
