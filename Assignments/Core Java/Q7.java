package Module_2;

import java.util.Scanner;

public class Q7 
{
public static void main(String[] args) 
{
	int digit=0;
	Scanner sc= new Scanner(System.in);
	
	System.out.println("please input an integer number less than ten billion:");
	int n=sc.nextInt();
	
	if (n < 0)
    {
        n *= -1;
    }
	else if(n>=0)
	{
		n*=1;
	}
	{
	while (n!=0)
	{
	    n = n/10;
	    digit++;
	}
	}
	System.out.println("Number of digits in the entered integer are :"+ digit);
}
}