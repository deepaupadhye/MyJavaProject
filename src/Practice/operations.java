package Practice;

public class operations {

	public static void main(String[] args) {
		
		int x=50;
		int y=100;
		int sum=x+y;
		int difference1=x-y;
		int difference2=y-x;
		int multiply=x*y;
		int divide1=y/x;
		float divide2=x/y;
		float modulus=x%y;
		int sum1=x+sum;
		int sum2=sum+sum1;
		System.out.println("Given integers are :               "+x +"    and    " +y);
		System.out.println("sum  of"+x +"    and     "+y   +"is:     "+sum);
		System.out.println("difference when u subtract:        " +x  +"   from   "     +y  +"      "      +difference1);
		System.out.println("difference when u subtract :       "   +y+    "from    " +x + "    "+difference2);
		System.out.println("multiplication of:                 " +x +"    and    " +y+ "   is:   "+multiply);
		System.out.println("when u divide:                     "+x +"  from   "  +y +"  the answer is:    "   +divide2);
		System.out.println("when u divide:                     "+y  +"   from   " +x+"    the answer is:    "   +divide1);
		System.out.println("modulus is:                        " +modulus);
		System.out.println("sum of :                           "+x +"   and     " +sum +"  is:   " +sum1);
		System.out.println("sum of:                            "  +sum+ "     and    "  +sum1+"     is:    "  +sum2);
		System.out.println(x==y);
		System.out.println(x>y);
		System.out.println(x<y);
		System.out.println(x!=y);
		System.out.println((x<y) && ( x==y));
		System.out.println((x>y) || (x==y));

	}

}
