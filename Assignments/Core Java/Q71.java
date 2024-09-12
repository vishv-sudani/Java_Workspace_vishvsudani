package Module_2;

import java.util.ArrayList;

public class Q71 
{
	public static void main(String[] args) 
	{
        ArrayList<String> list = new ArrayList<>();
        list.add("Ahmedabad");
        list.add("Rajkot");
        list.add("Surat");
        list.add("Baroda");

        System.out.println("ArrayList before replacement: " + list);

        if (list.size() > 1) 
        {
            list.set(1, "Blueberry");
        } 
        else 
        {
            System.out.println("The list does not have a second element.");
        }

        System.out.println("ArrayList after replacement: " + list);
    }
}
