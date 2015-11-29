package designpattern.singleton;

class stncls {

	private static stncls instance = new stncls();

	private stncls() {
		System.out.println("it is constructor");
	}

	public static stncls getobject() {
		return instance;
	}

	public void showsomedata() {
		System.out.println("this method");
	}

}

public class singleton {
	public static void main(String[] args) {

		// stncls obj= new stncls(); it is not visible because null constructor
		// is private
		// obj.showsomedata();

	stncls obj = stncls.getobject();
	obj.getobject().showsomedata();
	
	}
}