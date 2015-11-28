package designpattern.factory;

interface human {

	public String looks();
}

class male implements human {

	public String looks() {
		return "black and tall";
	}

}

class female implements human {

	public String looks() {
		return "slim and size";
	}

}

class resoluton {

	public human getresolution(String gender) {

		if (gender.equalsIgnoreCase("male")) {

			return new male();
		}
		if (gender.equalsIgnoreCase("female")) {
			return new female();

		}
		return null;

	}

}

public class factory {

	public static void main(String[] args) {

		resoluton res = new resoluton();
		human hu = res.getresolution("male");

		System.out.println(hu.looks());

		human hu2 = res.getresolution("female");

		System.out.println(hu2.looks());
	}

}