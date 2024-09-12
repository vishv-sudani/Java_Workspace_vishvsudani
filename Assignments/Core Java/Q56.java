package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q56 
{
	public static void main(String[] args) 
    {
    	ArrayList<String> list = new ArrayList<>();
        list.add("Iphone");
        list.add("Ipad");
        list.add("Iwatch");
        list.add("Imac");
        list.add("Airpods");

        System.out.println("Original ArrayList: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffled ArrayList: " + list);
	}
}
