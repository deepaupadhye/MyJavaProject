package Training;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    // Get the iterator
	    Iterator<String> it = cars.iterator();

	    // Print the first item
	    System.out.println(cars);
	    System.out.println(it.next());
	    
	    int age = 35;
	    
	    Integer sum = 45;
	    
	    System.out.println(age);
	    System.out.println(sum.intValue());


	}

}
