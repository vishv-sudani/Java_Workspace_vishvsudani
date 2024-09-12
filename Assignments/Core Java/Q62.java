package Module_2;

import java.util.ArrayList;

public class Q62 
{
	public static void main(String[] args) 
	 {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Red");
	        list.add("Yellow");
	        list.add("Green");
	        list.add("Orange");
	        list.add("Pimk");

	        System.out.println("Original ArrayList: " + list);

	        ArrayList<String> reversedList = new ArrayList<>();
	        for (int i = list.size() - 1; i >= 0; i--) 
	        {
	            reversedList.add(list.get(i));
	        }

	        System.out.println("Reversed ArrayList: " + reversedList);
	    }
}
