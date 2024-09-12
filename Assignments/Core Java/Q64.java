package Module_2;

import java.util.ArrayList;

public class Q64 
{
	public static void main(String[] args) 
	   {
		        ArrayList<String> list1 = new ArrayList<>();
		        list1.add("Rajkot");
		        list1.add("Ahmedabad");
		        list1.add("Surat");
		        
		        ArrayList<String> list2 = new ArrayList<>();
		        list2.add("Rajkot");
		        list2.add("Ahmedabad");
		        list2.add("Surat");

		        ArrayList<String> list3 = new ArrayList<>();
		        list3.add("Rajkot");
		        list3.add("Ahmedabad");
		        list3.add("Baroda");

		        boolean areEqual1 = list1.equals(list2);
		        System.out.println("List1 and List2 are equal: " + areEqual1);

		        boolean areEqual2 = list1.equals(list3);
		        System.out.println("List1 and List3 are equal: " + areEqual2);

		        boolean list1ContainsAllList3 = list1.containsAll(list3);
		        System.out.println("List1 contains all elements of List3: " + list1ContainsAllList3);

		        boolean list3ContainsAllList1 = list3.containsAll(list1);
		        System.out.println("List3 contains all elements of List1: " + list3ContainsAllList1);
		    
	   }
}
