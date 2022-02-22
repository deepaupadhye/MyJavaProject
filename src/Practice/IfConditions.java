package Practice;

public class IfConditions {

	public static void main(String[] args) {
		
		String name= "Deepa Dwarpalak";
		System.out.println(name);
		
		System.out.println("length of string is "+name.length());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
		System.out.println("welcome to the world of \"java\" programming");
		
		int x=40;
		int y=60;
		String Fname="deepa";
		String Lname="dwarpalak";
		String m="20";
		String n="60";
		String q=m+n;
		
		int z=x+y;
		String p=x+Fname;
		String Fullname=Fname+Lname;
		
		System.out.println(z);
		System.out.println(p);
		System.out.println(Fullname);
		System.out.println(q);
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		
		if(x==y)
		{
			System.out.println("Both are equal");
		}
			else
			{
				System.out.println("Both are not equal");
		}
		int age=25;
		
		if(age >18)
		{
			System.out.println("Driving Licence is issued");
		}
		else
		{
			System.out.println("Driving Licence is not issued");
		}
		
		int c=20;
		if (c>50)
		{
			System.out.println("number is greater than 20");
		}
		else if(c<50)
		{
			System.out.println("number is lesser than 50");
		}
		else
		{
			System.out.println("numbers are equal");
		}
		}


	
		
}
