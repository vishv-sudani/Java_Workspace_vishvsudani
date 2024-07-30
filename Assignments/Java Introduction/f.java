package Task_27_7;

//write a program you have to print the table of given number.

import java.util.Scanner;

public class f {
	public static void main(String[] args) {
		
	int i;
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter number you want to print table:");
	int n=sc.nextInt();
	
	for(i=1;i<=10;i++)
	{
		System.out.println(n+"*"+i+"="+(n*i));
	}
	}

}
