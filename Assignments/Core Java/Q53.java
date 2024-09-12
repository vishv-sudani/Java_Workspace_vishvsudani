package Module_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Q53 
{
	public static void main(String[] args) 
    {
    	ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Pink");
        list.add("Yellow");
        list.add("Black");
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        String searchElement = scanner.nextLine();
        
        if(list.contains(searchElement))
        {
        	 System.out.println(searchElement + " is found in the list.");
        }
        else {
            System.out.println(searchElement + " is not found in the list.");
        }

	}
}
