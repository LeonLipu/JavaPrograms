package basic;

import java.util.regex.*;
public class RegxCls {

	
	public static void main(String[] args) {
		Pattern P =Pattern.compile(".s");
		Matcher mtch=P.matcher("as ls");
	
		
		if (mtch.matches())
		{
			System.out.println(mtch.group());
		}
		
		
	}
}
