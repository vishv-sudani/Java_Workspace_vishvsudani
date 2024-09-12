package Module_2;

import java.util.ArrayList;

public class Q72 
{
	public static void main(String[] args) 
	 {
	        ArrayList<String> list = new ArrayList<>();
	        list.add("Rajkot");
	        list.add("Ahmedabad");
	        list.add("Surat");
	        list.add("Baroda");

	        for (int i = 0; i < list.size(); i++) 
	        {
	            System.out.println("Position " + i + ": " + list.get(i));
	        }
	    }
}
