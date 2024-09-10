package Module_2;

import java.util.Scanner;

public class Q9 
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Please enter character:");
        
		char ch = sc.next().charAt(0);
		
		int ascii = (int)ch;;

	    System.out.println("The ASCII value of " + ch + " is: " + ascii);
	    }

	}


