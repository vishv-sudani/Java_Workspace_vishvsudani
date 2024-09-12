package Module_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Q68 
{
	public static void main(String[] args) 
	{
        HashSet<String> set = new HashSet<>();
        set.add("Red");
        set.add("Orange");
        set.add("Green");
        set.add("Yellow");
        set.add("Pink");

        System.out.println("Original HashSet: " + set);

        List<String> list = new ArrayList<>(set);

        Collections.sort(list);
        System.out.println("Converted ArrayList: " + list);
    }
}
