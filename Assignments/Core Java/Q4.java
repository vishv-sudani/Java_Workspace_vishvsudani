//Write a program in Java to input 5 numbers from keyboard and find their sum and average using for loop//

package Module_2;

import java.util.Scanner;

public class Q4 {
public static void main(String[] args) {
	
Scanner sc= new Scanner(System.in);
	
	int i,sum=0;
	
	System.out.println("Please enter 5 numbers:");
	
	for(i=0;i<5;i++)
	{
		System.out.println("Enter Number" + (i+1) + ":");
		int n= sc.nextInt();
		
		sum=sum+n;
;	}
	
	double avg = (double) sum /5;
	
	System.out.println("Sum of five numbers is:"+sum);
	System.out.println("average of five numbers is:"+avg);
	
}
}
