package Module_2;

import java.util.ArrayList;
import java.util.List;

public class Q63 
{
	public static void main(String[] args) 
    {
    	ArrayList<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("7");

        System.out.println("Original ArrayList: " + list);

        int startIndex = 2;
        int endIndex = 5;

        List<String> subList = list.subList(startIndex, endIndex);

        System.out.println("Extracted portion: " + subList);
    }
}
