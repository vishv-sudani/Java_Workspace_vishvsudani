package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Q52 
{
	public static void main(String[] args) 
	   {
		   ArrayList<String> list = new ArrayList<>();
	       list.add("Apple");
	       list.add("Banana");
	       list.add("Cherry");
	       list.add("Grapes");
	       list.add("Watermalon");
	       
	       list.remove(3);
	       
	       Iterator i = list.iterator();
	       
	       while(i.hasNext())
	       {
	    	   System.out.println(i.next());
	       }
	       
	   }
}
