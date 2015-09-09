package collection;

import java.util.Enumeration;
import java.util.Vector;

public class vector {
	public static void main(String[] args) {

		// it similar like arraylist the difference is it double its size and
		// arraylise grow 50%
		// and other vector is synchronised and arraylist is not synchronised

		Vector<String> vc = new Vector<String>();

		vc.add("something");
		vc.add("something1");
		vc.add("something2");
		vc.add("something3");
		vc.add("something4");
		vc.add("something5");

		System.out.println(vc);

		Enumeration<String> enu = vc.elements();

		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());

		}

	}

}
