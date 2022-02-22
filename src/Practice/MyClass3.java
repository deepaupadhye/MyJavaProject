package Practice;

public class MyClass3 {

	public static void main(String[] args) {
		MyClass1 xObj=new MyClass1();
		MyClass1 yObj=new MyClass1();
		yObj.a = 700;
		yObj.b = 300;
		if (xObj.a>xObj.b)
		{
			
			System.out.println(xObj.a +"is greatest");
		}
		else
		{
			System.out.println(xObj.b +"is greatest");
		}
			
		System.out.println(xObj.a +xObj.b);
		System.out.println(yObj.a * yObj.b);
		MyClass2 pObj=new MyClass2();
		pObj.c=1;
		while(pObj.c<=5)
		{
			System.out.println("line"+pObj.c);
			pObj.c++;
		}

		

	}

}

