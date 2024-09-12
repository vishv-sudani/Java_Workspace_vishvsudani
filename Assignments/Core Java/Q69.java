package Module_2;

import java.util.HashMap;
import java.util.Map;

public class Q69 
{
	public static void main(String[] args) 
	{
        Map<String, String> map = new HashMap<>();
        map.put("Name", "Vishv");
        map.put("Age", "25");
        map.put("City", "Rajkot");

        boolean isEmpty = map.isEmpty();
        System.out.println("Is the map empty? : " + isEmpty);

        map.clear();

        isEmpty = map.isEmpty();
        System.out.println("Is the map empty after clearing?: " + isEmpty);
    }
}
