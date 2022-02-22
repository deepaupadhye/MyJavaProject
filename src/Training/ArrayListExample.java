package Training;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    cars.add("Mercedes");
	    cars.add("Honda");
	    cars.add("Cadilac");
	    System.out.println(cars);
	    
	    cars.set(4, "Farrari");
	    System.out.println(cars.get(4));


	}

}
