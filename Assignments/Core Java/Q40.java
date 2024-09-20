package Module_2;

import java.util.Scanner;

public class Q40 
{
	public static void validate()
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your age:");
		try 
		{
			int age = sc.nextInt();
			
			if(age<18)
			{
				throw new ArithmeticException(" not valid");
			}
			else
			{
				System.out.println("welcome to vote");
			}	
		} 
		catch (Exception e) 
		{
			System.out.println("Exception in thread main "+ e);
		}
	}
	public static void main(String[] args) 
	{
		validate();
	}
}
