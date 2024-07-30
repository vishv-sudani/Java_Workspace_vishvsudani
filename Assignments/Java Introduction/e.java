package Task_27_7;

//Write a program you have to print the Fibonacci series up to user given number

import java.util.Scanner;

public class e {
	public static void main(String[] args) {
		
		int a=0,b=1;
		int c=a+b;
	
        Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter term upto which you want to print fibonnaci series:");
		int n=sc.nextInt();
		
		System.out.print("Fibonacci Series:"+" "+a+" "+b);
	
		int i;
		for(i=3;i<=n;i++)
		{
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;
		}	
	}
}
