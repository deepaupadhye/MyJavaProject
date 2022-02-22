package Practice;

import java.util.ArrayList;

public class ArrayListEx {

	           
		   public static void main(String args[]){  
		      ArrayList<String> alist=new ArrayList<String>();  
		      alist.add("deepa");
		      alist.add("kavita");
		      alist.add("shweta");
		      alist.add("jyoti");
		      alist.add("pooja");
		      alist.add("pushkar");
		   //   alist.set(0, "priyana");
		  
		      //displaying elements
		      System.out.println(alist);
		  
		      //Adding "Steve" at the fourth position
		      alist.add(3, "parikshith");
		  
		      //displaying elements
		      System.out.println(alist);
		      
		      alist.remove("pooja");
		      alist.remove("jyoti");
		      alist.remove(2);
		      System.out.println(alist);
		      //iterating ArrayList
		      for(String str:alist)  
		         System.out.println(str);  
		   }  
	}
		

	
