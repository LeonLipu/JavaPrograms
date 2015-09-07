package generic;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class generic1 {

	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		
		Class cls= sampleclass.class;
		
		System.out.println(cls.getName());
		String classname =cls.getName();
		
	//create object in fly and invoke method in it .
		Object obj = Class.forName(classname).newInstance();
		
		
		for(Method m: cls.getMethods()){
			System.out.println(m.getName());
		}
		
	for( Field fld : cls.getDeclaredFields())
	{
		System.out.println(fld.toString()); //here  is string is datatype and something is value 
	}	
		
	 Method method=cls.getMethod("getdata",null);
	 method.invoke(obj,null); 
	 
	ClassLoader kk = cls.getClassLoader();
	System.out.println(kk.toString());
	 
	
	
		
	}
	
}
