package generic;

public class Bound {

	
	
	public static <E> void printArray(E [] Array ){
		
		for(E element:Array){
			
			System.out.println(element);
		}
		
		
	}
	
	
	public static <T extends Comparable<T>> T comparision(T x,T y ,T z){
		
		T max=x;
		if (y.compareTo(x)>0)
		{
		 max=y;
		}
		if (z.compareTo(y)>0)
		{
			max =z;
		}
		
		return max;
	}
	public static void main(String[] args) {
		
		Integer [] a={2,1,4,5,5};
		
		String [] cha={"lipu","sipu","para"};
		
		printArray(a);
		printArray(cha);
		
		//type
		
		System.out.println(comparision(2,1,4));
		System.out.println(comparision(2.6,1.3,9.0));
		
	}
}

class ABC
{
	

}

class XYZ{
	
	
}