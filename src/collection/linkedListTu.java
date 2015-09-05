package collection;

import java.util.LinkedList;
import java.util.List;

public class linkedListTu {

	public static void main(String[] args) {
		
		//linked list =deque + list .it is good for manupulation 
		LinkedList<String> lili = new LinkedList<String>();

		lili.add("A");
		lili.add("B");
		lili.add("c");
		lili.add("d");
		lili.add("e");
		lili.add("g");
		lili.add("h");
		lili.add("i");
		System.out.println(lili);
		lili.removeLast();
		System.out.println(lili);

	}

}
