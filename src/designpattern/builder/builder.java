package designpattern.builder;

import java.util.ArrayList;
import java.util.List;

interface packging {
	public String pack();
}

class wrapper implements packging {
	public String pack() {
		return "wrapper";
	}
}

class bottle implements packging {
	public String pack() {
		return "bottle";
	}
}

interface item {
	public String getname();

	public float price();

	public packging packing();
}

abstract class burger implements item {
	public packging packing() {
		return new wrapper();
	}

	public abstract float price();
}

abstract class coldDrinks implements item {
	public packging packing() {
		return new bottle();
	}

	public abstract float price();
}

class vegburger extends burger {

	public String getname() {
		return "veg burger";
	}

	public float price() {
		return 2.5f;
	}

}

class nonvegburger extends burger {

	public String getname() {
		return "nonveg burger";
	}

	public float price() {
		return 5.5f;
	}
}

	class coke extends coldDrinks {

		@Override
		public String getname() {
			// TODO Auto-generated method stub
			return "coke";
		}

		@Override
		public float price() {
			// TODO Auto-generated method stub
			return 0.5f;
		}

	}

	class pepsi extends coldDrinks {

		@Override
		public String getname() {
			// TODO Auto-generated method stub
			return "pepsi";
		}

		@Override
		public float price() {
			// TODO Auto-generated method stub
			return 0.2f;
		}

	}

	class meal {

		private List<item> items = new ArrayList<item>();

		public void additem(item it) {
			items.add(it);
		}

		public float getprice() {
			float cost = 0.0f;
			for (item it : items) {
				cost = cost + it.price();
			}
			return cost;
		}

		public void showitems() {

			for (item it : items) {
				System.out.println(it.getname());
				System.out.println(it.packing().pack());
				System.out.println(it.price());
			}
		}

	}
	
	class mealbuilder{
		public meal vegmeal(){
			meal mil =new meal();
			mil.additem(new vegburger());
			mil.additem(new pepsi());
			return mil;
		}
		public meal nonvegmeal(){
			meal mil=new meal();
			mil.additem(new nonvegburger());
			mil.additem(new coke());
			return mil;
		}
	}

	public class builder {
		public static void main(String[] args) {
			mealbuilder builder= new mealbuilder();
		meal veg=	builder.vegmeal();
		meal nonveg= builder.nonvegmeal();
		veg.showitems();
		veg.getprice();
		
		
		}
	}
