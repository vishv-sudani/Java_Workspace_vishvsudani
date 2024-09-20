package Module_2;

import java.util.Scanner;

public class Q36 
{
	 public static void main(String[] args) 
	    {
		 try 
			{
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter number 1: ");
	    	int n1 = sc.nextInt();
	    	
	    	System.out.println("Enter number 2: ");
	    	int n2 = sc.nextInt();
	    	
			int data = n1 / n2;
			System.out.println("Ans: " + data);
			
			} 
			catch (ArithmeticException e) 
			{
			   System.out.println("Exception in thread main "+ e);
			}
		}
}
