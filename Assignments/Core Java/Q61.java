package Module_2;

import java.util.HashMap;

public class Q61 
{
	public static void main(String[] args) 
	{
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Rajkot", 3);
        map.put("Bhuj", 2);
        map.put("Surat", 5);
        map.put("Baroda", 4);

        System.out.println("HashMap: " + map);

        int size = map.size();

        System.out.println("Number of key-value mappings in the HashMap: "+ size);
}
}