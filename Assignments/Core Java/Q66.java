package Module_2;

import java.util.ArrayList;

public class Q66 
{
	public static void main(String[] args) 
	{
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("4");
        list2.add("5");
        list2.add("6");

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        list1.addAll(list2);

        System.out.println("Joined ArrayList: " + list1);
    }
}
