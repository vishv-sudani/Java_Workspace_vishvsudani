package Module_2;

import java.util.HashSet;

public class Q67 
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
            
            String[] array = set.toArray(new String[0]);

            System.out.println("Converted Array: ");
            for (String element : array) 
            {
                System.out.println(element);
            }
	   }
}
