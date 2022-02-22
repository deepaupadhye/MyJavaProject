package Practice;

public class car {
	
	static void myCar()
	{
		System.out.println("i like faster cars");
	}
	
	
	public void  speed(int car1, int car2)
	{
		if (car1>car2)
		{
			System.out.println("car1 is faster");
		}
		else
		{
			System.out.println("car2 is faster");
		}
	}

	public static void main(String[] args) {
		
		car objcar= new car();
		objcar.speed(100, 60);
		myCar();

	}

}
