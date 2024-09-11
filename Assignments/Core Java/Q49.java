package Module_2;

import java.util.Iterator;
import java.util.LinkedList;

public class Q49 
{
	public static void main(String[] args) 
    {
		LinkedList<String>list = new LinkedList<>();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.addFirst("6");
		
		Iterator<String> i = list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
