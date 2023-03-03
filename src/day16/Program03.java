package day16;

import java.util.*;
import java.util.Map.Entry;

public class Program03 {

	public static void main(String[] args) {
		Hashtable<String,Integer> x= new Hashtable<>();
		x.put("aa", 101);
		x.put("bb", 102);
		x.put("cc", 103);
		x.put("dd", 104);
		x.put("ee", 105);
		System.out.println(x);
		
		System.out.println(x.keySet());
		
		System.out.println(x.values());
		
		System.out.println(x.entrySet());
		
		System.out.println(x.containsKey("bb"));
		
		System.out.println(x.containsValue(102));
		
		System.out.println(x.get("cc"));
		
		System.out.println(x.isEmpty());
		
		System.out.println(x.size());
		
		for(String keys:x.keySet())
		{
			System.out.println(keys);
		}
		
		for(Integer value:x.values())
		{
			System.out.println(value);
		}
		
		for(Entry<String, Integer> entry: x.entrySet())
		{
			System.out.println(entry.getKey() +"   "+entry.getValue());
		}
		
		x.clear();
		
		System.out.println(x);

	}

}
