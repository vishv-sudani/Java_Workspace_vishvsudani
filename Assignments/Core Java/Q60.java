package Module_2;

import java.util.HashMap;

public class Q60 
{
	public static void main(String[] args) 
	 {
	      
	        HashMap<Integer, String> map = new HashMap<>();
	        
	        map.put(1, "Red");
	        map.put(2, "Orange");
	        map.put(3, "Green");

	        System.out.println("Original HashMap: " + map);

	        int key = 4;
	        String value = "Pink";
	        map.put(key, value);
	        
	        System.out.println("Updated HashMap: " + map);
	    }
}
