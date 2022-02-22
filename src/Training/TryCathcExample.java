package Training;

public class TryCathcExample {

	public static void main(String[] args) {
		try {
		int[] myNumbers = {1, 2, 3, 4, 5, 6};
	    System.out.println(myNumbers[3]); // error!
		} catch (Exception e) {
			System.out.println("Please enter value between 0 to 5");
		}
		finally  {
			System.out.println("Thank you for your input!");
		}
	}

}
