package Task_27_7;


//Write a program make a summation of given number(E.g. 1523 ans :11)

import java.util.Scanner;

public class i {

	public static void main(String[] args) {
		
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter any number:");
		int num=sc.nextInt();
		
		while(num>0)
		{
			int rem=(num%10);
			sum+=rem;
			num=num/10;
		}
		
		System.out.println("Sum of all digits:"+sum);
		
}
}
