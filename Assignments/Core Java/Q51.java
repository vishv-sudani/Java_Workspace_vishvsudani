package Module_2;

import java.util.ArrayList;

public class Q51 
{
	public static void main(String[] args) 
    {
    	 ArrayList<String> list = new ArrayList<>();
         list.add("Vishv");
         list.add("Harsh");
         list.add("Riya");
         list.add("Prince");
         list.add("KInjal");
         
         int index = 2;
         
         String newElement = "Mitesh";
         
         if (index >= 0 && index < list.size()) 
         {
             list.set(index, newElement);
             System.out.println("Updated List: " + list);
         } 
         else 
         {
             System.out.println("Index out of bounds.");
         }
	}
}
