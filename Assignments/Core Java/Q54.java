package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q54 
{
	public static void main(String[] args) 
	   {
		   ArrayList<String> list = new ArrayList<>();
		   
		   list.add("Banana");
	       list.add("Apple");
	       list.add("Mango");
	       list.add("Grapes");
	       list.add("Orange");

	       System.out.println("Original ArrayList: " + list);

	       Collections.sort(list);

	       System.out.println("Sorted ArrayList: " + list);
	   }
}
