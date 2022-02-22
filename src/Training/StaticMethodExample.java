package Training;

public class StaticMethodExample {

	static void deepaMethod() {
		int x = 50;
		int y = 120;
		System.out.println("Hi this is deepa");
		System.out.println("Code Lab Technology");
		System.out.println(x * y);
	}
	
	static void aksMethod(String fname, int age) {
		System.out.println(fname + " dwarpalak " +"age is "+age );
	}
	
	static int numMethod(int x) {
		
		return  x;
	}
	
	public static void main(String[] args) {
		
		deepaMethod();
		
		aksMethod("sudhi", 3);
		aksMethod("krishna",45);
		aksMethod("shree", 35);
		
		System.out.println(numMethod(50));
		System.out.println(numMethod(230));
		
		
		

	}

}
