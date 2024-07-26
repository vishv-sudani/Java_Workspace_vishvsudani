package Work_26_7;

public class Nested_if {

	public static void main(String[] args) {
	
		int age=65;
		
		if (age>18)
		{
			System.out.println("You are eligible to vote");
			
			if(age>60)
			{
				System.out.println("You are senior Citizen");
			}
			else
			{
				System.out.println("You are not senior Citizen");
			}
		}
		else
		{
			System.out.println("You are not eligible to vote");
		}
}
}
