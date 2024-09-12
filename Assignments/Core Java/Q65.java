package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q65 
{
	public static void main(String[] args) 
	   {
		        ArrayList<String> list = new ArrayList<>();
		        list.add("Rajkot");
		        list.add("Baroda");
		        list.add("Jamnagar");
		        list.add("Anand");
		        list.add("Nadiad");

		        System.out.println("Original ArrayList: " + list);
		        
		        int index1 = 1; 
		        int index2 = 3; 

		        Collections.swap(list, index1, index2);

		        System.out.println("ArrayList after swapping: " + list);
		    }
}
