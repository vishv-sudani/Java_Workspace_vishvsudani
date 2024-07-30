package Task_27_7;

//write a program you have to find the factorial of given number.

import java.util.Scanner;

public class d {
	public static void main(String[] args) {
		
		int f=1;
		int i=1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any Number");
		int n=sc.nextInt();
		
		while(n>=i)
		{
			f=f*i;
			i++;
		}
		
		System.out.println("Factorial of "+n+" is:"+f);
	}

}
