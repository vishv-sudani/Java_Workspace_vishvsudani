package Module_2;

import java.util.ArrayList;

public class Q70 
{
	public static void main(String[] args) 
	   {
		        ArrayList<Integer> list = new ArrayList<>();

		        for (int i = 0; i < 5; i++) 
		        {
		            list.add(i);
		        }

		        System.out.println("ArrayList before resizing: " + list);

		        for (int i = 5; i < 10; i++) 
		        {
		            list.add(i);
		        }

		        System.out.println("ArrayList after resizing: " + list);
		    
	   }
}
