package Module_2;

import java.util.Scanner;

public class Q39 
{
	 public static void main(String[] args) 
	    {
			
			try 
			{
				Scanner sc = new Scanner(System.in);
	            System.out.println("enter no.1 :");
	            int num1= sc.nextInt();
	            
	            System.out.println("enter no.2 :");
	            int num2= sc.nextInt();
	            
	            int result = num1 / num2;
	            
	            System.out.println("Result: " + result);
			} 
			catch (ArithmeticException e) 
			{
				System.out.println("Exception in thread main " + e);
			}
			
	     }
}
