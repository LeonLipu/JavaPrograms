package generic;

public class sampleclass {
	String data="something ";
	
	public void getdata (){	
		System.out.println(this.data);
	}

	
	public String echo (){
		
		
		System.out.println("Malleshwar");
		
		return null;
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello brahmananda kar");		
		sampleclass object= new sampleclass();	
		object.getdata();
		
	}
}
