package Task_27_7;

//Write a program you have to make a summation of first and last Digit.

import java.util.Scanner;

public class j {
public static void main(String[] args) {
	
	int sum=0,rem;
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter any number:");
	int num=sc.nextInt();
	
	rem=(num%10);
	while(num>=10)
	{
		 num=num/10;
	}
	sum=rem+num;
	
	System.out.println("Sum of first and last digits:"+sum);
	
}
}


