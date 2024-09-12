package Module_2;

import java.util.HashSet;

public class Q57 
{
	public static void main(String[] args) 
    {
    	HashSet<String> set = new HashSet<>();
        set.add("Rajkot");
        set.add("Surat");
        set.add("Baroda");

        System.out.println("Original HashSet: " + set);

        String newElement = "Ahmedabad";
        set.add(newElement);

        System.out.println("Updated HashSet: " + set);
	}
}
