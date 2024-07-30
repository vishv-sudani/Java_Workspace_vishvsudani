package Task_27_7;

//Write a program to find out the max from given number
import java.util.Scanner;

public class h {
	
	public static void main(String[] args) {
		
			
			int max=0;
			
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter any number:");
			int num=sc.nextInt();
			
			while(num>0)
			{
				int rem=(num%10);
				if(max<rem)
				{
					max=rem;
				}
				num=num/10;
			}
			
			System.out.println("Max of all digits:"+max);		
	}
	}

