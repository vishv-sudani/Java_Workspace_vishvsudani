package Module_2;

import java.util.ArrayList;
import java.util.Iterator;

public class Q52 
{
	public static void main(String[] args) 
	   {
		   ArrayList<String> list = new ArrayList<>();
	       list.add("Rajkot");
	       list.add("Ahmedabad");
	       list.add("Surat");
	       list.add("Baroda");
	       list.add("Bhuj");
	       
	       list.remove(3);
	       
	       Iterator i = list.iterator();
	       
	       while(i.hasNext())
	       {
	    	   System.out.println(i.next());
	       }
	       
	   }
}
