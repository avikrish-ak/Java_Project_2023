package day16;

import java.util.Arrays;
import java.util.HashSet;

public class Program01 {

	public static void main(String[] args) {
		HashSet<Integer> x= new HashSet<>();
		x.addAll(Arrays.asList(1,2,3,4));
		System.out.println(x);
		
		HashSet<Integer> y= new HashSet<>();
		y.addAll(Arrays.asList(3,4,5,6));
		System.out.println(y);
		
		HashSet<Integer> union= new HashSet<>(x);
		union.addAll(y);
		System.out.println(union);
		
		
		HashSet<Integer> intersection= new HashSet<>(x);
		intersection.retainAll(y);
		System.out.println(intersection);
		
		
		HashSet<Integer> xdiffy= new HashSet<>(x);
		xdiffy.removeAll(y);
		System.out.println(xdiffy);
		
		
		HashSet<Integer> ydiffx= new HashSet<>(y);
		ydiffx.removeAll(x);
		System.out.println(ydiffx);
		
	}

}
