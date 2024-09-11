package Module_2;

import java.util.ArrayList;
import java.util.Collections;

public class Q56 
{
	public static void main(String[] args) 
    {
    	ArrayList<String> list = new ArrayList<>();
        list.add("Virat");
        list.add("Dhoni");
        list.add("Bumrah");
        list.add("Kapil");
        list.add("Hardik");

        System.out.println("Original ArrayList: " + list);

        Collections.shuffle(list);

        System.out.println("Shuffled ArrayList: " + list);
	}
}
