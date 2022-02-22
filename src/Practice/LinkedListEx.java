package Practice;

import java.util.LinkedList;

public class LinkedListEx{
	 public static void main(String args[])
	 {

	     LinkedList<String> list=new LinkedList<String>();

	     //Adding elements to the Linked list
	     list.add("deepa");
	     list.add("kavita");
	     list.add("maahi");
System.out.println(list);
	     //Adding an element to the first position
	     list.addFirst("pooja");

	     //Adding an element to the last position
	     list.addLast("priyana");

	     //Adding an element to the 3rd position
	     list.add(2, "pushkar");
	     
	     System.out.println(list);

	 }
}
