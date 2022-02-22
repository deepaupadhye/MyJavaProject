package Practice;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEx {
	
		 
		  public static void main(String args[]){
		    ArrayList names = new ArrayList();
		    names.add("Chaitanya");
		    names.add("pushkar");
		    names.add("parikshith");
		 
		    Iterator it = names.iterator();
		 
		    while(it.hasNext()) {
		      String obj = (String)it.next();
		      System.out.println(obj);
		    
		    }
		 
		}

}
