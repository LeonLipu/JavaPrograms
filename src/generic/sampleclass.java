package generic;

public class sampleclass {
	String data="something ";
	
	public void getdata (){	
		System.out.println(this.data);
	}

	
	
	public static void main(String[] args) {
		System.out.println("hello brahmananda kar");		
		sampleclass object= new sampleclass();	
		object.getdata();
	}
}
