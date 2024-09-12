package Module_2;

import java.util.ArrayList;

public class Q50 
{
	public static void main(String[] args) 
    {
    	 ArrayList<String> list = new ArrayList<>();
         list.add("Pizza");
         list.add("Burger");
         list.add("Hotdog");
         list.add("Vadapav");
         list.add("Sandwich");
         
         int index = 2;
         
         if (index >= 0 && index < list.size()) 
         {
             String element = list.get(index);
             System.out.println("Element at index " + index + ": " + element);
         } 
         else 
         {
             System.out.println("Index out of bounds.");
         }
	}
}
