package Module_2;

import java.util.HashSet;

public class Q59 {
public static void main(String[] args) 
{
        
        HashSet<String> set = new HashSet<>();
        set.add("Sunday");
        set.add("Monday");
        set.add("Tuesday");
        set.add("Wednesday");

        System.out.println("HashSet: " + set);

        int size = set.size();

        System.out.println("Number of elements in the HashSet: " + size);
    }
}
