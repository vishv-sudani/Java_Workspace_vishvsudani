package Task_27_7;

//Write a program to print the number in reverse order

import java.util.Scanner;

public class g {
public static void main(String[] args) {
	
	int revnum=0;
	int rem;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter Number you want to reverse:");
	int num=sc.nextInt();
	
	while(num>0)
	{
		rem=num%10;
		revnum=(revnum*10)+rem;
		num=num/10;	
	}
	System.out.println("reverse number is:"+revnum);
	
	
			
}
}
