package Module_2;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Q74 
{
	public static void main(String[] args) 
	{
        Map<String, Integer> map = new HashMap<>();
        map.put("RAJKOT", 1);
        map.put("AHMEDABAD", 2);
        map.put("BARODA", 3);
        map.put("SURAT", 4);

        Collection<Integer> values = map.values();

        System.out.println("Values in the map: " + values);
    }
}
