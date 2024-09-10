package Module_2;

public class Q17 
{
	public static void main(String[] args) 
    {
		String s1 = "Red is my favorite color";
		String c1 = "Red";
		
		String s2 = "Orange is also my favorite color";
		String c2 = "Red";
		
		boolean B1 = s1.startsWith(c1);
		boolean B2 = s2.startsWith(c2);
		
		System.out.println("\"" + s1 + "\" starts with \"" + c1 + "\"? : " + B1);
		System.out.println("\"" + s2 + "\" starts with \"" + c2 + "\"? : " + B2);
	}
}
