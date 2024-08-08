//Write a Java program that takes a year from user and print whether that year is a leap year or not//
package Module_2;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year:");
		int y=sc.nextInt();
	
		
		if((y%4)==0)
		{
			System.out.println(y+" is leap year");
		}
		else
		{
			System.out.println(y+" is not leap year");
		}
		}
}
