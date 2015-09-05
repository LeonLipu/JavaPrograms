package collection;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {

		
		//this is array list== list + abstract= take null and maintain insertion order and allow duplicate
		// it is good for data retrieve 
		ArrayList<String> li = new ArrayList<String>();
		li.add("something");
		li.add("hello");
		li.add("hello");
		li.add("hello33");
		li.add("hello");
		li.add("hello");
		li.add("hello");
		li.add(null);
		li.add("hello");
		System.out.println(li);
		
		
		

	}

}
