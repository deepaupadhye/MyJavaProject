package Practice;

public class ForLoopEx {

	public static void main(String[] args)
	{
		int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
		int x = myNumbers[1][2];
		System.out.println(x); // Outputs 7

		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		System.out.println(cars.length);
		System.out.println(cars[1]);
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}


	}

}
