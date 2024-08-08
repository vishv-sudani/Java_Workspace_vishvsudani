//Write a Java program that takes the user to provide a single character from the alphabet. Print Vowel or Consonant, depending on the user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.//

package Module_2;

import java.util.Scanner;

public class Q2 {
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Single character: ");
		String a = sc.next();
		//char b = sc.next().charAt(0);
		if(a.length()>1)
		{
			System.out.println("Please Enter Single character only");
		}
		else
		{
			char c = a.charAt(0);
			//System.out.println(c);
			int d = c;
			if((d>=65 && d<=90)||(d>=97 && d<=122))
			{
				if(c==97 || c==101 || c== 105 || c== 111 || c==117 || c==65 || c==69 || c== 73 || c==79 || c==85)
				{
					System.out.println("It's a vowel");
				}
				else
				{
					System.out.println("It's a Consonant");
				}
			}
			else
			{
				System.out.println("Please Enter Value Between A to Z");
			}
			
			
		}
		
	}
}
