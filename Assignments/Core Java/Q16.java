package Module_2;

public class Q16 
{
	public static void main(String[] args) 
    {
		String s1 = "Java Excercises";
		String se1 = "se";
		
		String s2 = "Java Excercise";
		String se2 = "se";
		
		boolean A1 = s1.endsWith(se1);
		boolean A2 = s2.endsWith(se2);
		
		System.out.println("\"" + s1 + "\" ends with \"" + se1 + "\"? : " + A1);
        System.out.println("\"" + s2 + "\" ends with \"" + se2 + "\"? : " + A2);
	}
}
