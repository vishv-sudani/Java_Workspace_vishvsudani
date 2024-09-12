package Module_2;

import java.util.HashSet;
import java.util.Iterator;

public class Q58 
{
	public static void main(String[] args) 
	 {
	        
	        HashSet<String> set = new HashSet<>();
	        set.add("Vishv");
	        set.add("Harsh");
	        set.add("Bhargav");
	        set.add("Darshit");

	        System.out.println("HashSet: " + set);

	        System.out.println("Iterating using Iterator:");
	        Iterator<String> iterator = set.iterator();
	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        
	   }
	}
}
