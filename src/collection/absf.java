package collection;

interface color {
	public void draw();
}

class red implements color {
	public void draw() {
		System.out.println("it is red color");
	}
}

class white implements color {
	public void draw() {
		System.out.println("it is white color");
	}
}

interface shape {
	public void fill();
}

class rect implements shape {
	public void fill() {
		System.out.println(" it is rectangular");
	}
}

class square implements shape {
	public void fill() {
		System.out.println("it is sqaure");
	}
}

abstract class absfactory {

	abstract public shape getshape(String shape);

	abstract public color getcolor(String color);
}

class shapefactory extends absfactory {
	public shape getshape(String shape) {
		if (shape.equalsIgnoreCase("rect")) {
			return new rect();
		}
		if (shape.equalsIgnoreCase("square")) {
			return new square();
		}
		return null;
	}

	@Override
	public color getcolor(String color) {
		// TODO Auto-generated method stub
		return null;
	}
}

class colorfactory extends absfactory {

	public color getcolor(String color) {
		if (color.equalsIgnoreCase("red")) {

			return new red();
		}
		if (color.equalsIgnoreCase("white")) {
			return new white();
		}
		return null;
	}

	@Override
	public shape getshape(String shape) {
		// TODO Auto-generated method stub
		return null;
	}
}

class factoryproducer {
	public static absfactory getfactory(String factory) {

		if (factory.equalsIgnoreCase("shaspefactory")) {
			return new shapefactory();
		}

		if (factory.equalsIgnoreCase("colorfactory")) {
			return new colorfactory();
		}
		return null;

	}
}

public class absf {

	public static void main(String[] args) {

		absfactory absf=factoryproducer.getfactory("colorfactory");
		color col=absf.getcolor("red");
		col.draw();
		

	}

}
