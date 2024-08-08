
//Write a Java program to Take three numbers from the user and print the greatest number//
package Module_2;

import java.util.Scanner;

public class Q1 {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Enter First Number:");
	int fn=sc.nextInt();
	
	System.out.println("Enter Second Number:");
	int sn=sc.nextInt();
	
	System.out.println("Enter Third Number:");
	int tn=sc.nextInt();
	
	if(fn>sn && fn>tn)
	{
		System.out.println(fn +"is the largest number");
	}
	
	else if(sn>fn && sn>tn)
	{
		System.out.println(sn +"is the largest number");
	}
	else
	{
		System.out.println(tn +"is the largest number");
	}
}
}
