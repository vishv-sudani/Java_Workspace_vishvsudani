package Module_2;

import java.util.ArrayList;

public class Q55 
{
	public static void main(String[] args) 
    {
   	 ArrayList<String> originalList = new ArrayList<>();
   	 
        originalList.add("Red");
        originalList.add("Blue");
        originalList.add("Green");
        originalList.add("Yellow");
        originalList.add("Purple");

        System.out.println("Original ArrayList: " + originalList);

        ArrayList<String> copyList = new ArrayList<>();

        copyList.addAll(originalList);

        System.out.println("Copied ArrayList: " + copyList);
    }
}
