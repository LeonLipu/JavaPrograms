package collection;

import java.util.HashSet;
import java.util.Set;

public class Setapp {

	// hashset =set + abstract and it taking only unique value and not taking null and not maintain insertion order
	public static void main(String[] args) {
		Set se=new HashSet();
		
		se.add("hello");
		se.add("hello2");
		se.add("hell3");
		se.add("hell4");
		se.add("hello");
		se.add(null);
		System.out.println(se);
		
	}
}
